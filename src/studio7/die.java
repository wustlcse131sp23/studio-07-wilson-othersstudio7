package studio7;

public class die {
	private int n;
	public die(int theN) {
		theN=n;
		
	}
	public int getDie() {
		int throw = (int)(Math.random()*n);
		return throw;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
