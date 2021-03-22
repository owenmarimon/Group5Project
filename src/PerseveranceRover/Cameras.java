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
public class Cameras implements SelfCheckCapable {
	String CacheCam;
	String MastCamZ;
	String FrontHazCam;
	String RearHazCam;
	String NavCams;
	
	/**
	 * Takes a picture of anything within camera's range.
	 */
	void PictureCapture() {
		
	}
	
	/**
	 * Takes a video of anything within camera's range.
	 */
	void VideoCapture() {
		
	}
	
	/**
	 * Notifies the rover of any obstacles within its
	 * vicinity.
	 */
	void ObstacleSignal() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Cameras";
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
