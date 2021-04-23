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
public class PropertyAccessSystem implements SelfCheckCapable {
	String EntranceProtocols;
	String PerimeterSecurity;
	String SecurityGuards;
	
	/**
	 * Maintains visual of entrance point.
	 */
	void MonitorDirectEntrance() {
		
	}
	
	/**
	 * Prohibits entry access to user.
	 */
	void DeclineUser() {
		
	}
	
	/**
	 * Allows entry access to user.
	 */
	void AcceptUser() {
		
	}
	
	/**
	 * Records user specifications.
	 */
	void RegisterUser() {
		
	}
	
	/**
	 * Locks entrance point.
	 */
	void Lock() {
		
	}
	
	/**
	 * Unlocks entrance point.
	 */
	void Unlock() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "PropertyAccessSystem";
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
