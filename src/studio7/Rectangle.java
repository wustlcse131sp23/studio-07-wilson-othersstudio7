package studio7;

import java.util.Scanner;

public class Rectangle {
	private double width;
	private double length;
	
	public Rectangle(double theWidth, double theLength) {
		width = theWidth;
		length = theLength;
		
	}
	public double calculateArea() {
		return width *length;
	}
	public double calculatePerimeter() {
		return (2*width) + (2*length);
	}

	public boolean isASquare() {
		if (width == length)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	Rectangle r1 = new Rectangle(2.0,2.0);
	System.out.println(r1.calculateArea());
	System.out.println(r1.calculatePerimeter());
	System.out.println(r1.isASquare());
	
	
	
		
		
	
		
		
		// TODO Auto-generated method stub

	}

}
