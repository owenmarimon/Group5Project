/**
 * 
 */
package SecuritySystem;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author omari
 *
 */
public class Server implements SelfCheckCapable {
	String InternetConnection;
	String AutomaticResponseMechanism;
	
	/**
	 * Notifies authorities when an incident occurs.
	 */
	void ContactPolice() {
		
	}
	
	/**
	 * Communicates with systems.
	 */
	void Communicate() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Server";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck();
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
