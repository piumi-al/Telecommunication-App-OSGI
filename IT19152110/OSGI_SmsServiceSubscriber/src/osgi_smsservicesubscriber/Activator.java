package osgi_smsservicesubscriber;

import java.util.Scanner;


import org.osgi.framework.BundleActivator;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import smspublisher.SmsService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("SMS subscriber start!");
		
		serviceReference = context.getServiceReference(SmsService.class.getName());
		SmsService smsService = (SmsService ) context.getService(serviceReference);
		
		startProcess(smsService);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("SMS subscriber stop!");
		context.ungetService(serviceReference);
	}
	
	public void startProcess(SmsService smsService) {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Welcome to Dialog SMS Service *******");
		System.out.println("*********************************");
		System.out.println("*********************************");
			
           
		smsService.useSmsService();
		
		System.out.println("Do you want to activate another SMS package ? (Y/N)");
		Scanner qtsc = new Scanner(System.in);
		String qt =  qtsc.next();
		if(qt.equalsIgnoreCase("Y")) {
			
			startProcess(smsService);
			
		}
		
		else {
			
			System.out.println("Thank you, join with us again !");
			//break;
		}
		
		
	}
	
	
	
	

}