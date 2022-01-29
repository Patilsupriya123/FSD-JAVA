package Methods;

public class CallingMethods {

	public void print()
    {
        System.out.println("Method without return type and without Para");
    }
    
    //method returning nothing with 1 Parameter
    public void display(String name)
    {
        System.out.println("My Name is "+name);
    }
    
    //method with return type and parameters
    public int cube(int n)
    {
        return n*n*n;
    }
    
    //method return string and with 2 Parameters
    public String fullName(String fname,String lname)
    {
        return fname+" "+lname;
    }

 public static void main(String[]  args) {
	 
	 CallingMethods cm=new CallingMethods();
	 cm.display("Supriya");	 
	
	 String name=cm.fullName("Supriya", "Patil");
	System.out.println("Fullname is: "+name);
	
	cm.print();
	
	int value=cm.cube(5);
	System.out.println("value is"+value);
 }
}