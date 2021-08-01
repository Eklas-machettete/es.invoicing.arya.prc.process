package com.invoicing.controller;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.runtime.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.invoicing.model.Invoice;
import com.invoicing.model.Invoices;
import com.invoicing.service.InvoicingService;

import camundajar.impl.com.google.gson.Gson;


@Controller
public class InvoicingController {

	  private static final Logger LOG = Logger.getLogger(InvoicingController.class.getName());
		
	  @Autowired
	  private RuntimeService runtimeService;
	  @Autowired
	  private InvoicingService invoicingService;
	  
	    @PostMapping(path = "/invoicesProcessed", consumes = "application/json", produces = "application/json")
		@ResponseBody
		public ResponseEntity startProcess(@RequestBody Invoices invoices) throws InvalidKeyException, IOException {
	
	    	return invoicingService.startProcess(invoices);

	    }

}
