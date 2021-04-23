/**
 * 
 */
package SecuritySystem;

/**
 * @author omari
 *
 */
public class SecurityHub {
	String Processor;
	String Memory;
	String Hardrive;
	
	/**
	 * Monitors security levels of all systems.
	 */
	void MonitorSecurity() {
		
	}
	
	/**
	 * Sends information to all systems.
	 */
	void DistributeInformation() {
		
	}
	
	/**
	 * Processes any data/information received.
	 */
	void ProcessData() {
		
	}
	
	/**
	 * Commands components to perform certain actions.
	 */
	void SendCommands() {
		
	}
	
	/**
	 * Receives data/feedback from all systems.
	 */
	void ReceiveData() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database sDatabase = new Database();
		sDatabase.runSelfCheck();
		
		AlarmSystem sAlarmSystem = new AlarmSystem();
		sAlarmSystem.runSelfCheck();
		
		SensorSystem sSensorSystem = new SensorSystem();
		sSensorSystem.runSelfCheck();
		
		CameraSystem sCameraSystem = new CameraSystem();
		sCameraSystem.runSelfCheck();
		
		PropertyAccessSystem sPropertyAccessSystem = new PropertyAccessSystem();
		sPropertyAccessSystem.runSelfCheck();
		
		Server sServer = new Server();
		sServer.runSelfCheck();
		
		SecurityActionProcessor sSecurityActionProcessor = new SecurityActionProcessor();
		sSecurityActionProcessor.runSelfCheck();
		
		Drone sDrone = new Drone();
		sDrone.runSelfCheck();

	}

}
