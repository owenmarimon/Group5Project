/**
 * 
 */
package PerseveranceRover;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author omari
 *
 */
public class Suspension implements SelfCheckCapable {
	String Wheels;
	String Motor;
	
	/**
	 * Commands rover to move forward.
	 */
	void Drive() {
		
	}
	
	/**
	 * Commands rover to move backwards.
	 */
	void Reverse() {
		
	}
	
	/**
	 * Commands rover to move in left-side direction.
	 */
	void TurnLeft() {
		
	}
	
	/**
	 * Commands rover to move in right-side direction.
	 */
	void TurnRight() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Suspension";
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
