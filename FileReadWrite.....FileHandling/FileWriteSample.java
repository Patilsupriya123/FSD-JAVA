package FileReadWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteSample {
	public static void main(String[] args) {
		
		char operator;
		double num1,num2,result;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Operator: +, -, *, or /");
	    operator = sc.next().charAt(0);

	    System.out.println("Enter first number");
	    num1 = sc.nextDouble();

	    System.out.println("Enter second number");
	    num2 = sc.nextDouble();
        
		String data = "Enter your numbers";
  
		try {
			FileWriter writer = new FileWriter("D:\\Test\\data1.txt");
			writer.write(data);
			
		    switch (operator) {
		    case'+':
			result=num1+num2;
			System.out.println("Addition : "+result);
			break;
			
		    case'-':
			result=num1-num2;
			System.out.println("Substraction : "+result);
			break;
			
		    case'*':
		    result=num1*num2;
			System.out.println("Multiplication : "+result);
			break;
			
		    case'/':
		    result=num1/num2;
		    
			if(num2 !=0)
				System.out.println("Division : "+result);

				else
		    	System.out.println("Divide by 0 situation");
		        break;

		      default:
		        System.out.println("Invalid Operator");
		        break;
		    }
		    
			System.out.println("Data is Written Successfully.");

		    }catch(IOException ex) {
			
			System.out.println("File is Written successfully.");

		    }
		   
	}
}
		
	
		
	


