package osgi_lornservicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import loanpublisher.LoanService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Loan Subscriber Start");
		
		serviceReference = context.getServiceReference(LoanService.class.getName());
		LoanService loanService = (LoanService) context.getService(serviceReference);
		
		startProcess(loanService);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Loan Subscriber Stop");
		context.ungetService(serviceReference);
	}
	
	public void startProcess(LoanService loanService) {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("*********************************");
		System.out.println("******* Welcome to Dialog Loan Service *******");
		System.out.println("*********************************");
		System.out.println("*********************************");
			
           
		loanService.useLoanService();
		
		System.out.println("Do you want to activate another loan package ? (Y/N)");
		Scanner qtsc = new Scanner(System.in);
		String qt =  qtsc.next();
		if(qt.equalsIgnoreCase("Y")) {
			
			startProcess(loanService);
			
			
		}
		
		else {
			
			System.out.println("Thank you, join with us again !");
			//break;
		}
		
		
		
	}

}
