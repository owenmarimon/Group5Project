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
public class Antennas implements SelfCheckCapable {
	String UHFAntenna;
	String HighGainAntenna;
	String LowGainAntenna;
	
	/**
	 * Sends any form of communication to Earth including
	 * sound, image, and other data.
	 */
	void SendData() {
		
	}
	
	/**
	 * Receives communication from Earth such as commands.
	 */
	void ReceiveData() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Antennas";
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
