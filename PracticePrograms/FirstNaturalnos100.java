package PracticePrograms;

import java.util.Scanner;

public class FirstNaturalnos100 {

	
	public static void main(String[] args) 
	{
		int number, i;
		 Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			System.out.print(i +" \n "); 
		}	
	}
}




