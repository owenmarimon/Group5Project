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
	
	/**
	 * Drone motor is activated.
	 */
	void MotorOn() {
		
	}
	
	/**
	 * Drone motor is deactivated.
	 */
	void MotorOff() {
		
	}
	
	/**
	 * Avoids any obstacles along its path.
	 */
	void Avoid() {
		
	}
	
	/**
	 * Moves drone forward.
	 */
	void Forward() {
		
	}
	
	/**
	 * Moves drone backward.
	 */
	void Back() {
		
	}
	
	/**
	 * Increase drone altitude.
	 */
	void IncreaseElevation() {
		
	}
	
	/**
	 * Decrease drone altitude.
	 */
	void DecreaseElevation() {
		
	}
	
	/**
	 * Moves drone left.
	 */
	void Left() {
		
	}
	
	/**
	 * Moves drone right.
	 */
	void Right() {
		
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
