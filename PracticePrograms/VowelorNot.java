package PracticePrograms;

import java.util.Scanner;

public class VowelorNot {

    public static void main(String[] args) {

        char ch;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character : ");
    	char ch1=sc.next( ).charAt(0);	 


        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u'|| ch1 == 'A' || ch1 == 'E' || ch1 == 'I'|| ch1 == 'O' || ch1 == 'U')
            System.out.println(ch1 + " is vowel");
        else
            System.out.println(ch1 + " is not vowels");

    }
}


