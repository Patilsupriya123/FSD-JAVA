package FileReadWrite;

import java.io.File;
import java.io.IOException;

public class CreateReadWrite {
	
	public static void main(String[] args)
	{
		//File MyFile = new File("Test1.txt");
		File MyFile = new File("D:\\JavaFiles\\data1.txt");
		
		try
		{
		if(MyFile.createNewFile()) {
		System.out.println("File Created Successfully");
		}
		else {
			System.out.println("File Creation error");

			}
		}catch(IOException ex) {
			System.out.println("File  error......");

		}
	}
			
}	
	


