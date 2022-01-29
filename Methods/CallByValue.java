package Methods;

public class CallByValue {
	int n=250;
	
	
	void operation(int n) {
		this.n=n*10/100;
		}
	public static void main(String[] args) {
		CallByValue c=new CallByValue();
		System.out.println("Before function calling: "+c.n);
		
		c.operation(200);
		System.out.println("After function calling: "+c.n);

	}

}
