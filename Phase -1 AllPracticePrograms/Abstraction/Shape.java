package Abstraction;

public abstract class Shape {
	
	private String color;
	abstract double area();
	
	public Shape(String color)
	{
		System.out.println("Constructor called");
		this.color=color;
		
		}
	 public String getcolor()
	 {
		 return color;
	 }
	}
