package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {

	private double length;
	private double width;
	
	public rectangle(double recLength, double recWidth) {		
		this.length = recLength;
		this.width = recWidth;
	}
	
	public double area() {
		return this.length*this.width;
	}
	
	public double perimeter() {
		return this.length*2+this.width*2;
	}
	
	public boolean isSquare() {
		
		if (this.length==this.width)
			return true;
		else
			return false;
	}
	
	public void draw() {
		StdDraw.filledRectangle(0.5, 0.5, this.width/2, this.length/2);
	}
	
	public boolean isBigger(rectangle r) {
		if (this.area() < r.area()) 
			return false;
		else
			return true;	
	}

}
