package smspublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println(" SMS Pulisher start! ");
		SmsService smsService = new SmsServiceImpl();
		serviceRegistration = context.registerService(SmsService.class.getName(), smsService, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("SMS Pulisher stop!");
		serviceRegistration.unregister();
	}

}
