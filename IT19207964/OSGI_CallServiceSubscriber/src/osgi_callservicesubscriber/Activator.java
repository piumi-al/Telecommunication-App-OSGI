package osgi_callservicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import callpublisher.CallService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Call Subscriber Start!");
		
		serviceReference = context.getServiceReference(CallService.class.getName());
		CallService callService = (CallService) context.getService(serviceReference);
		
		startProcess(callService);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Call Subscriber stop!");
		context.ungetService(serviceReference);
	}
	
	public void startProcess(CallService callService) {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Welcome to Dialog Call Service *******");
		System.out.println("*********************************");
		System.out.println("*********************************");
			
           
		callService.useCallService();
		
		System.out.println("Do you want to activate another caller package ? (Y/N)");
		Scanner qtsc = new Scanner(System.in);
		String qt =  qtsc.next();
		if(qt.equalsIgnoreCase("Y")) {
			
			startProcess(callService);
			
		}
		
		else {
			
			System.out.println("Thank you, join with us again !");
			//break;
		}
		
		
	}

}
