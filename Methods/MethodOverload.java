package Methods;

public class MethodOverload {
	
	void display() {
		System.out.println("Hello");
		
	}
	
	int sub(int x,int y) {
		return x-y;
	}
	
	int sub(int a, int b, int c) {

		return a-b-c;
	}
	
	double add(double d,double e) {
		return  d+e;
	}
	
	double add(double x,double y, double z) {
		return x+y+z;
		
	}

public static void main(String[] args) {
	MethodOverload mo=new MethodOverload();
	
	mo.display();
	
	System.out.println("Substraction is: "+mo.sub(24, 12));
	System.out.println("Substraction is: "+mo.sub(34, 12, 23));
	System.out.println("Addition is: "+mo.add(23.12, 12.3));
	System.out.println("Addition is: "+mo.add(34.12, 12.24, 23.90));

}
	
}