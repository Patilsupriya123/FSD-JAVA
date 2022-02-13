package LockedMe;

public class LockedMeMain {
	
public static void main(String[] args) {
		
	
		BusinessLevelOperations.createMainFolderIfNotPresent("main");
		
		MainMenu.printWelcomeScreen("Welcome", "Supriya patil");
		
		SecondaryMenu.WelcomeScreen();
	}


}
