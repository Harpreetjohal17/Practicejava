class Base
{
	public void Test3()
	{
		System.out.println("DB");
	}
}


public class Basic2 {
	
	public void Test() //user define method and we can change any number of time
	{
		System.out.println("Manual");
	}
	
	public void Test2()
	{
		System.out.println("Automation");
	}
	
	// Java define method and we cant change - it should be one only

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing");
		
		//object creation
		
		//Classname ref = new Constructor();
		//ref.userdefinemethod();
		Basic2  b = new Basic2(); //object creation
		b.Test();
		b.Test2();
		
		Base b1 = new Base();
		b1.Test3();
		

	}

}
