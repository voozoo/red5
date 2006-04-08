package org.red5.server.api.service;

import org.red5.server.api.IContext;

/**
 * Invoke a call against a context
 * 
 * @author luke
 */
public interface IServiceInvoker {

	public IServiceCall invoke(IServiceCall call, IContext context); // note no scope involved.
	public IServiceCall invoke(IServiceCall call, Object service); // the service to use
	
}
