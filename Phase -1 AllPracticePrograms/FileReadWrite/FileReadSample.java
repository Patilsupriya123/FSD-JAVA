package FileReadWrite;

import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {
	
	public static void main(String[] args) {
		char[] data = new char[100];
		
		try 
		{
			FileReader input = new FileReader("D:\\JavaFiles\\data1.txt");
			input.read(data);
			System.out.println("Data received from a file");
			input.close();
			
			
		} catch(IOException ex) {
			System.out.println("file read error....");

		}
	}
}
