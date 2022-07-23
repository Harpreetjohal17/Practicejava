class UN {
	public void CurrencyGenartor() {
		System.out.println("Currency growth calculator");

	}
}

class India extends UN {
	public void type () {
		System.out.println("Rupees");
	}

}

class USA extends UN{
	public void type() {
		System.out.println("dollars");
	}

}

class UK extends UN {
	public void type() {
		System.out.println("pounds");
	}

}

public class Currencytest {

	public static void main(String[] args) {
		
		India in = new India();
		in.CurrencyGenartor();
		in.type();
		
		USA u = new USA();
		u.CurrencyGenartor();;
		u.type();
		
		UK uk = new UK();
		uk.CurrencyGenartor();;
		uk.type();
		
		//
	}

}
