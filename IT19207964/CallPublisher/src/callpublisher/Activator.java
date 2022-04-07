package callpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Call Publisher Start!");
		CallService callService = new CallServiceImpl();
		serviceRegistration = context.registerService(CallService.class.getName(), callService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Call Publisher Stop!");
		serviceRegistration.unregister();
	}

}
