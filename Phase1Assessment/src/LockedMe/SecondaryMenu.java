package LockedMe;

import java.util.List;
import java.util.Scanner;

public class SecondaryMenu {
	public static void WelcomeScreen() {
		boolean files = true;
		Scanner scan = new Scanner(System.in);
		do {
			
			try {
				MainMenu.displayMenu();
				int operator = scan.nextInt();

				switch (operator) {
				case 1:
					System.out.println("Display all file list in directory");
					BusinessLevelOperations.displayAllFiles("main");
					break;
				
				case 2:
					SecondaryMenu.FileMenuOptions();
					break;
				
				case 3:
					System.out.println("Program exited successfully.");
					files = false;
					scan.close();
					System.exit(0);
					break;
				
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
		      WelcomeScreen();
			} 
		} while (files == true);
	}
	
	public static void FileMenuOptions() {
		boolean files = true;
		Scanner scan = new Scanner(System.in);
		do {
			try {
				MainMenu.displayFileMenuOptions();
				BusinessLevelOperations.createMainFolderIfNotPresent("main");
				
				int input = scan.nextInt();
				switch (input) {
				
				case 1:
					// Create a file
					System.out.println("Enter the name of the file to be added to the \"main\" folder");
					String fileToAdd = scan.next();
					
					BusinessLevelOperations.createFile(fileToAdd, scan);
					
					break;
				
				case 2:
					// Delete a file or Folder to be delete
					System.out.println("Enter the name of the file to be deleted");
					String fileToDelete = scan.next();
					
					BusinessLevelOperations.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = BusinessLevelOperations.displayFileLocations(fileToDelete, "main");
					
					String deletion = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					
					System.out.println(deletion);
				
					int index = scan.nextInt();
					
					if (index != 0) {
						BusinessLevelOperations.deleteFileRecursively(filesToDelete.get(index - 1));
					} else {
						
						// If idx == 0, delete all files displayed for the name
						for (String path : filesToDelete) {
							BusinessLevelOperations.deleteFileRecursively(path);
						}
					}
					break;
				
				
				case 3:
					
					// Search a File/Folder Search
					
					System.out.println("Enter the file name to be search");
					String fileName = scan.next();
					
					BusinessLevelOperations.createMainFolderIfNotPresent("main");
					BusinessLevelOperations.displayFileLocations(fileName, "main");
					break;
				
				
				case 4:
					
					// Go to Previous menu
					return;
				
				
				case 5:
					
					// Exit the program
					System.out.println("Program exited successfully.");
					files = false;
					scan.close();
					System.exit(0);
				
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				FileMenuOptions();
			}
		} while (files == true);
	}
}
