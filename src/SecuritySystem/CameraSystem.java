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
public class CameraSystem implements SelfCheckCapable {
	String Lens;
	String ThermalScreening;
	String Environment;
	
	/**
	 * Takes a video recording of anything within camera's range.
	 */
	void CaptureFootage() {
		
	}
	
	/**
	 * Takes a photo of anything within camera's range.
	 */
	void CapturePhoto() {
		
	}
	
	/**
	 * Sends any recordings to Hub.
	 */
	void SendDataToHub() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "CameraSystem";
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
