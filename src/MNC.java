class AmazonUSA {
	final public void logo() {
		System.out.println("Company logo");
	}

	public void salary() {
		System.out.println("salary in dollars");
	}
	public void policy() {
		System.out.println("American policy");
	}
}

class AmazonIndia extends AmazonUSA

{
	public void salary() {
}
	public void policy() {
		System.out.println("Indian policy");
	}
}

class AmazonUK {
	public void salary() {
		System.out.println("salary in pounds");
	}
	public void policy() {
		System.out.println("UK policy");
	}

}

public class MNC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonUSA am = new AmazonUSA();
		am.logo();
		am.salary();
		am.policy();

	}

}
