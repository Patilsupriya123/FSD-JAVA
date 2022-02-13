package LockedMe;

public class MainMenu {
	
		public static void printWelcomeScreen(String appName, String developerName) {
			String AppDetails = String.format("**************************************************************************\n"
					+ "________________________** Welcome to LockedMe.com.**_____________________ \n" + "**_____________This application was developed by Supriya Patil._________**\n"
					+ "**************************************************************************\n", appName, developerName);
			String AppFunction = "* You can use this application :-\n"
					+ "___Retrieve all file names. \n"
					+ "___Create,Search or Delete files. \n"
					
					+ "\n\nPlease correct filename is provided for searching or deleting files.\n\n";
			
			System.out.println(AppDetails);

			System.out.println(AppFunction);
		}

		public static void displayMenu() {
			String displayMainMenu = "\n\n--------------Select any option number from below and press Enter--------------\n\n"
					+ "1. Retrieve all files \n" + 
					"2. Display menu for File operations\n"
					+ "3. Exit program \n";
			System.out.println(displayMainMenu);

		}

		public static void displayFileMenuOptions() {
			String displayfileMenu = "\n\n****** Select any option number from below and press Enter ******\n\n"
					+ "1. Create a file \n"+ 
					"2. Delete a file \n"
					+ "3. Search for a file \n" + 
					"4. Show Previous Menu\n" + 
					"5. Exit program(Go Back)\n";

			System.out.println(displayfileMenu);
		

	}

}
