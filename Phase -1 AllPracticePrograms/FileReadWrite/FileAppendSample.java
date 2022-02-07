package FileReadWrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppendSample {
	
	public static void main(String[] args) {
		String data = "Welcome to qspider";

		try {
			FileWriter output = new FileWriter("D:\\JavaFiles\\data1.txt");
			output.write(data);
			System.out.println("Data appended Successfully.");
			output.close();

		}catch(IOException ex) {
			
			System.out.println("File append error.....");

		}
	}


}
