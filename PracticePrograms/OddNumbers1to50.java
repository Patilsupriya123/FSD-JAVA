package PracticePrograms;

import java.util.Scanner;

public class OddNumbers1to50 {
	   public static void main(String args[]) {
		
		   int n;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Odd Numbers from 1 to "+ 50 +" are: ");
		for (int i = 1; i <= 50; i++) 
		{
		   if (i % 2 != 0) 
		   {
			System.out.print(i + " \n ");
		   }
		}
	   }
	}


