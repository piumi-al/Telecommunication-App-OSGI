package loanpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {

		ServiceRegistration serviceRegistration;

		public void start(BundleContext context) throws Exception {
			System.out.println("Loan Publisher Start!");
			LoanService loanService = new LoanServiceImpl();
			serviceRegistration = context.registerService(LoanService.class.getName(), loanService, null);
		}

		public void stop(BundleContext context) throws Exception {
			System.out.println("Loan Publisher Stop!");
			serviceRegistration.unregister();
		}

	}
