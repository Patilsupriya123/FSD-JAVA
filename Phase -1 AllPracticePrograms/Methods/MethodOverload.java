package Methods;

	
public class MethodOverload {

		public int multipynumbers(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			MethodOverload b=new MethodOverload();
			int ans= b.multipynumbers(10,3);
			System.out.println("Multipilcation is :"+ans);
			}


}