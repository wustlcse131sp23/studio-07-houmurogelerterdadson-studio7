package studio7;

public class complex {

	private double real;
	private double imaginary;
	
	public complex(double r, double i) {
		
		this.real = r;
		this.imaginary = i;
		
	}
	
	public String add(complex n) {
		
		return this.real+n.real+" + "+this.imaginary+n.imaginary;
		
	}
	
	public String mulitply(complex n) {
		
		double re = this.real * n.real - this.imaginary * n.imaginary;
		double im = this.real * n.imaginary + this.imaginary * n.real;
		
		return re + " + " + im + "i";
	}
	
}
