package Returntype;

class Returntype {
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double x, double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,5));
		System.out.println(add(2.9,5.3));

		
	}

}
