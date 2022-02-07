package Returntype;

class Returntype {
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double x, double y) {
		return x+y;
	}
	static int sub(int a,int b,int c) {
		return a-b-c;
	}
	static double div(double l,double m,double n) {
		return l/m/n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,5));
		System.out.println(add(2.9,5.3));
		System.out.println(sub(2,5,9));
		System.out.println(sub(20,5,90));

		
	}

}