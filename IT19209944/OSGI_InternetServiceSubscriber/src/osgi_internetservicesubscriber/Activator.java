package osgi_internetservicesubscriber;

import java.util.Scanner;


import org.osgi.framework.BundleActivator;


import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import internetpublisher.InternetService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Internet Subscriber!");
		
		serviceReference = context.getServiceReference(InternetService.class.getName());
		InternetService internetService = (InternetService) context.getService(serviceReference);
		
		startProcess(internetService);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Internet Subscriber!");
		context.ungetService(serviceReference);
	}
	
	public void startProcess(InternetService internetService) {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Welcome to Dialog Internet Service *******");
		System.out.println("*********************************");
		System.out.println("*********************************");
			
           
		internetService.useInternetService();
		
		System.out.println("Do you want to activate another internet package ? (Y/N)");
		Scanner qtsc = new Scanner(System.in);
		String qt =  qtsc.next();
		if(qt.equalsIgnoreCase("Y")) {
			
			startProcess(internetService);
			
		}
		
		else {
			
			System.out.println("Thank you, join with us again !");
			//break;
		}
		
		
	}
	
	
	
	

}
