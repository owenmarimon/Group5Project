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
public class SecurityActionProcessor implements SelfCheckCapable {
	String AutomationSoftware;
	
	/**
	 * Performs specific security action for an incident.
	 */
	void ExecuteSecurityMeasures() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "SecurityActionProcessor";
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
