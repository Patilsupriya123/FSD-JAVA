import java.util.Scanner;

public class ValidationOfEmailId {

        public static void main(String[] args) {  
           
        	String[] strArray = { "patilsupriya757@gmail.com", "Shivanipatil312@gmail.com", "meenaathvle2gmail.com","seemamane@gmail.com","seetasathe543@gmail.com","rohinipatil@gmail.com",};  
            
        	//initializing email to false
            boolean email = false;   
            
            
            //declaration of index variable  
            int in = 0; 
            
            System.out.println("Enter your emailid: ");
            Scanner sc=new Scanner(System.in);
            
            String s=sc.next();
            
                       
            // Iteration of the String Array  
            
            for (int i = 0; i < strArray.length; i++) {  
                if(s.equals(strArray[i])) {  
                    in = i; 
                    email = true;
                    break;  
                }  
            }  
            if(email)  
                System.out.println(s +" User Authenticated in index no: "+in);  
            else  
                System.out.println(s +" String is not found invalid user");  
        }  
}  

