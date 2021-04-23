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
public class Drone implements SelfCheckCapable {
	String Engine;
	String Propeller;
	String Controller;
	String GPSModule;
	
	/**
	 * Identifies any threat when activated.
	 */
	void IdentifyThreat() {
		
	}
	
	/**
	 * Oversees any activity within its range of presence detection.
	 */
	void ConductSurveillance() {
		
	}
	
	/**
	 * Provides information based on findings.
	 */
	void SendData() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Drone";
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
