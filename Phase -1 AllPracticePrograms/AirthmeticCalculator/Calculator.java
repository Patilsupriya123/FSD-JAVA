package AirthmeticCalculator;

import java.util.Scanner;

public class Calculator {
  
	public static void main(String[] args) {

    char operator;
    Double number1, number2, result;

    Scanner Scan = new Scanner(System.in);

    System.out.println("Enter the Operator: +, -, *, or /");
    operator = Scan.next().charAt(0);

    System.out.println("Enter first number");
    number1 = Scan.nextDouble();

    System.out.println("Enter second number");
    number2 = Scan.nextDouble();

    switch (operator) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
          result = number1 / number2;

    	if(number2 !=0)
    		
    		
        System.out.println(number1 + " / " + number2 + " = " + result);
    	  else
    	System.out.println("Divide by 0 situation");
        break;

      default:
        System.out.println("Invalid Operator");
        break;
    }

  }
}

