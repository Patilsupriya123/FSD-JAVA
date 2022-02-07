package Abstraction;

	
public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle(double length,double width,String color)
	{
		super (color);
		this.length=length;
		

}
	double area() {
		return length*width;
	}
	
	public String toString() {
		return "Rectangle color=" + "and area is "+area(); 
	}
}
