package internetpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Internet Pulisher Service! ");
		InternetService internetService = new InternetServiceImpl();
		serviceRegistration = context.registerService(InternetService.class.getName(), internetService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Internet Pulisher Service!");
		serviceRegistration.unregister();
	}

}
