package Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double no1;
		double no2; 
		double ans;
		char op;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter two numbers: "); 
		no1 = sc.nextDouble();
		no2 = sc.nextDouble(); 
		System.out.print("\nEnter an operator (+, -, , /): ");
	    op = sc.next().charAt(0); 
		switch(op) {
		case '+': ans = no1 + no2;
		break; 
		case '-': ans = no1 - no2;
		break; 
		case '*': ans = no1 * no2; 
	    break; 
		case '/': ans = no1 / no2; 
		break; 
		default: System.out.printf("Error! Enter correct operator");
		return; 
		} 
		System.out.print("\nThe result is given as follows:\n"); 
		System.out.printf(no1 + " " + op + " " + no2 + " = " + ans); 
		
	}
}


