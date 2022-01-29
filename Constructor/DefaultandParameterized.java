package Constructor;

public class DefaultandParameterized {
	 private String empName;
	private String department;
	private float salary;
	private int empId;
	{
	    int empId;
	    String empName;
	    String department;
	    float salary;
	} 
	    //default constructor
	    public DefaultandParameterized()
	    {
	        
	        empName="Emp0001";
	        department="finance";
	        salary=35000;
	    }
	    //parameterized constructor
	    public DefaultandParameterized(String empName,String department,float salary)
	    {
	        this.empName=empName;
	        this.department=department;
	        this.salary=salary;
	    }
	    //parameterized constructor
	    public DefaultandParameterized(int empId,String empName,String department,float salary)
	    {
	        this.empId=empId;
	        this.empName=empName;
	        this.department=department;
	        this.salary=salary;
	    }
	    public void display()
	    {
	        System.out.println("Id: "+empId);
	        System.out.println("Name: "+empName);
	        System.out.println("Department "+department);
	        System.out.println("Salary "+salary);
	    }
	    public static void main(String[] args) {
	    	DefaultandParameterized d=new DefaultandParameterized();
	    	DefaultandParameterized d1= new DefaultandParameterized(12, "Anusha", "I.T.", 450000);
	        
	    
	   d.display();
	        d1.display();
	    
	}

}
