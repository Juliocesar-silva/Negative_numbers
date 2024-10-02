package entities;

public class Verification_numbers {
	
	private int number;
	
	public Verification_numbers(int number) {
		this.number = number;
	}
	
	public int get_number() {
		return number;
	}
	public void negative_or_not() {
		if(number < 0) {
			System.out.println("The number: "+number+", is negative");
		}else {
			System.out.println("The number: "+number+", is positive");
		}
	}
	
	
}
