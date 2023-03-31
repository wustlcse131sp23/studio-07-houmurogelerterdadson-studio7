package studio7;

public class fraction {

	private int numerator;
	private int denominator;
	
	public fraction(int num, int den) {
		
		this.numerator = num;
		this.denominator = den;
		
	}
	
	public String add(fraction r) {
		
		int num = this.numerator*r.denominator + this.denominator*r.numerator;
		int denom = this.denominator*r.denominator;
		
		return num+"/"+denom;
		
	}
	
	public String multiply(fraction r) {
			
		int num = this.numerator*r.numerator;
		int denom = this.denominator*r.denominator;
		
		return num+"/"+denom;
			
	}
	
	public String recip() {
		
		return this.denominator+"/"+this.numerator;
			
	}
	
	public String simplify() {
		
		int num = this.numerator;
		int denom = this.denominator;
		
		for (int i = this.numerator; i >= 1; i--) {
			if (num%i == 0 && denom%i==0) {
				num = num/i;
				denom = denom/i;
			}
		}
		int a = 0;

		if (num >= denom) {
			while (num >= denom) {
				num = num-denom;
				a++;
			}
		}
		return a + "  " + num + "/" + denom;
	}
	
}
