package ConstructorDefault;

public class Employee {
	
	int  empId;
	String empName;
	String department;
	float salary;
	
	//default constructor  
	Employee()
	{
		System.out.println("Default constructor");
		
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		 e.Employee();
	}
	private void Employee() {
		// TODO Auto-generated method stub
		System.out.println("Constructor");
		
	}

}
