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
public class SensorSystem implements SelfCheckCapable {
	String Detector;
	
	/**
	 * Processes whenever an intrusion has occurred.
	 */
	void DetectsIntrusion() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "SensorSystem";
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
