/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.invoicing.delegate;

import java.io.File;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map.Entry;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.invoicing.model.Files;

@Service("driveDelegate")
public class DriveDelegate implements JavaDelegate {


 // @Value("${ocr.url}")
  private String url="http://localhost:8084/ocr/v1.0/files";
  
  //@Value("${callback.url}")
  private String callback="http://localhost:8080/invoicing/v1.0/invoicesProcessed";
	  
  private static final Logger LOGGER = LoggerFactory.getLogger(DriveDelegate.class);
    
  public void execute(DelegateExecution execution) throws Exception {
	  Files files = new Files();
	  com.invoicing.model.File file = new com.invoicing.model.File();
	  ArrayList<com.invoicing.model.File> files_array = new ArrayList<>();
	  String encodedFile = "";

		Integer ind = (Integer) execution.getVariable("INDEX");
		String starter = ""+execution.getVariable("starter");
		LOGGER.info("Extrayendo libros de facturas: "+ind);
	    for(int fi = 0; fi < ind; fi++)
		{
			byte[] byteArrInStrm = (byte[]) execution.getVariable("DOCUMENT_"+fi);
			String file_name = execution.getVariable("NAME_"+fi).toString();
			LOGGER.info("file_name:"+file_name);
			encodedFile += new String(Base64.getEncoder().withoutPadding().encode(byteArrInStrm), "UTF-8");
			file.setEncode(encodedFile);
			file.setName(file_name);
			files_array.add(file);
		}
	    files.setFiles(files_array);
	    files.setClassification("invoices");
	    
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("callbackUrl", callback)
                .queryParam("owner", starter);
	    
	    RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Files> request = new HttpEntity<Files>(files, headers); 
        String resultAsJsonStr = restTemplate.postForObject(builder.toUriString(), request, String.class);
	    
  }
}
