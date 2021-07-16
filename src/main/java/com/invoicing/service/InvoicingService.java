package com.invoicing.service;

import java.io.IOException;

import java.security.InvalidKeyException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import com.invoicing.controller.InvoicingController;
import com.invoicing.model.Invoice;
import com.invoicing.model.Invoices;

@Service
public class InvoicingService {
	  private static final Logger LOG = Logger.getLogger(InvoicingController.class.getName());

	  @Autowired
	  private RuntimeService runtimeService;
	@Async  
	public ResponseEntity startProcess(Invoices invoices) throws InvalidKeyException, IOException {
		
    	//runtimeService.startProcessInstanceByKey("startAuditoria");
    	/*String json = "";
    	for(RFile File: RFile_list) {
    		json += "||"+File.getNombre()+"||"+File.getEncode();
    	}*/
        //System.out.println("RFile_list: "+json);
    	Invoice invoice = new Invoice();
    	invoice = invoices.getInvoices().get(0);
    	runtimeService.createProcessInstanceByKey("startValidation")
        .businessKey("startValidation")
        .setVariable("starter", invoices.getOwner())
        .setVariable("name", invoice.getFileName().substring(invoice.getFileName().indexOf("-"), invoice.getFileName().length()))
        .execute();
    	
	    
    	LOG.log(Level.INFO, ResponseEntity.ok().build());
		return ResponseEntity.ok().build();
			
    }

}

	
	

