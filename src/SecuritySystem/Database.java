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
public class Database implements SelfCheckCapable {
	String Software;
	String RecordCapability;
	
	/**
	 * Records any entrance activity.
	 */
	void LogEntranceRecords() {
		
	}
	
	/**
	 * Maintains record of any user activity.
	 */
	void KeepUserRecords() {
		
	}
	
	/**
	 * Maintains information from all systems.
	 */
	void StoreInformation() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Database";
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
