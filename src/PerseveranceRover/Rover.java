/**
 * 
 */
package PerseveranceRover; 

/**
 * @author omari
 *
 */
public class Rover {
	String Body;
	String Computer;
	String PowerSource;
	
	/**
	 * Performs system check on entirety of rover to ensure
	 * everything is running smoothly.
	 */
	void SystemCheck() {
		
	}
	
	/**
	 * Produces electricity to power the rover.
	 */
	void ElectricityProduction() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arm pArm = new Arm();
		pArm.runSelfCheck();
		
		Cameras pCameras = new Cameras();
		pCameras.runSelfCheck();
		
		Antennas pAntennas = new Antennas();
		pAntennas.runSelfCheck();
		
		Suspension pSuspension = new Suspension();
		pSuspension.runSelfCheck();

	}

}
