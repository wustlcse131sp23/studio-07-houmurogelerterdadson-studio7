package studio7;

public class die {

	private int sides;
	
	public die(int n) {
		
		this.sides = n;
		
	}
	
	public int number() {
		
		int num = (int) Math.random()*this.sides+1;
		return num;
		
	}

}
