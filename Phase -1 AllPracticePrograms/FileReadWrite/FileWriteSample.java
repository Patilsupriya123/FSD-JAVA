package FileReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteSample {
	
    
	public static void main(String[] args) {
		String data = "Enter your numbers";
  
		try {
			FileWriter output = new FileWriter("D:\\JavaFiles\\data1.txt");
			output.write(data);
			System.out.println("Data is Written Successfully.");
			output.close();

		}catch(IOException ex) {
			
			System.out.println("File is Written successfully.");

		}
		
	}


}
