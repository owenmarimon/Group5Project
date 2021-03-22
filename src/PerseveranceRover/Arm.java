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
public class Arm implements SelfCheckCapable {
	String Turret;
	String CoringDrill;

	/**
	 * Extends arm to reach objects/samples.
	 */
	void Extend() {
		
	}
	
	/**
	 * Retracts arm back to rover.
	 */
	void Retract() {
		
	}
	
	/**
	 * Drills into Mars' surfaces to collect samples.
	 */
	void Drill() {
		
	}
	
	/**
	 * Analyzes samples using scientific cameras, and mineral 
	 * and chemical analyzers.
	 */
	void Analyze() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Arm";
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
