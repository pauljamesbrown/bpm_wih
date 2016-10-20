package com.sample.wih;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceCallWorkItem implements WorkItemHandler {

	private static Logger logger = LoggerFactory.getLogger(ServiceCallWorkItem.class);
	
	enum WSMode {
        SYNC,
        ASYNC,
        ONEWAY;
    }
	
	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
		System.out.println("abort work item");
		
	}

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager workItemManager) {
	
		logger.debug("execute work item");
		
		String interfaceRef = (String) workItem.getParameter("Interface");
        String operationRef = (String) workItem.getParameter("Operation");
        String endpointAddress = (String) workItem.getParameter("Endpoint");
	
        logger.debug("Values passed in" + interfaceRef + " : " + operationRef + " : " + endpointAddress);
       
        try {
        }
        
        catch (Exception e) {
        	logger.debug(e.toString());
        } finally {
        	//TODO: this needs to be coded
        }
	}

}
