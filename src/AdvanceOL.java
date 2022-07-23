class AOL1
{
	public void Test(byte a, short b)
	{
		System.out.println("calling int and long");
	}
	public void Test(long a, String b)
	{
		System.out.println("calling long and int");
	}
	
	public void Test(int a , double b)
	{
		System.out.println("Calling char and double");
	}
	public void Test(int a , float b)
	{
		System.out.println("Calling int and float");
	}
	
}

public class AdvanceOL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AOL1 a = new AOL1();
//		a.Test((byte)10, (short)20);
//		a.Test(10L, "Test");
		a.Test('a', 20);

	}

}
