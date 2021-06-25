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
package com.invoicing;

import javax.annotation.PostConstruct;

import org.camunda.bpm.engine.FormService;
import org.camunda.bpm.engine.IdentityService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.form.FormField;
import org.camunda.bpm.engine.form.TaskFormData;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.event.EventListener;

import camundajar.impl.scala.collection.immutable.List;

@SpringBootApplication
@EnableProcessApplication
//@ImportResource("classpath*:applicationContext.xml")
public class InvoicingApplication {

  
  @Autowired
  private RuntimeService runtimeService;
  
  @Autowired
  private ManagementService managementService;

  public static void main(String... args) {
    SpringApplication.run(InvoicingApplication.class, args);
  }
  
  @PostConstruct
	public void startProcess() {
		managementService.toggleTelemetry(false);
	}

  @EventListener
  private void processPostDeploy(PostDeployEvent event) {
	  	//ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("startAuditoria");
		//ProcessInstance pi = runtimeService.createProcessInstanceQuery().processInstanceId(processInstance.getId()).singleResult();
  }
}
