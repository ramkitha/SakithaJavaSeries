package EncapsulationConcept;

public class Browser {
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkVersion();
		checkRam();
		checkLAtestUpdates();
		checkOSCompatibility();
		
		
	}
	
	private void checkVersion() {
		System.out.println("checkVersion of browser");
	}
	
	private void checkRam() {
		System.out.println("Check the RAM size");
	}
	
	
	private void checkLAtestUpdates() {
		System.out.println("Checking latest updates");
	}
	
	private void checkOSCompatibility() {
		System.out.println("Checking OS compatibility");
	}

}
