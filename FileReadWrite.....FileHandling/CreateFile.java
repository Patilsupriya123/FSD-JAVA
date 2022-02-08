package FileReadWrite;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args)
	{
		File MyFile = new File("D:\\Test\\data1.txt");
		
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
	


