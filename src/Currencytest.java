class currency {
	public void category() {
		System.out.println("currency");

	}
}

class India extends currency {
	public void type () {
		System.out.println("Rupees");
	}

}

class USA extends currency{
	public void type() {
		System.out.println("dollars");
	}

}

class UK extends currency {
	public void type() {
		System.out.println("pounds");
	}

}

public class Currencytest {

	public static void main(String[] args) {
		
		India in = new India();
		in.category();
		in.type();
		
		USA u = new USA();
		u.category();
		u.type();
		
		UK uk = new UK();
		uk.category();
		uk.type();
	}

}
