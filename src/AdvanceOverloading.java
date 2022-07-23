class AOL
{
	public void Test(int a, long b)
	{
		System.out.println("calling int and long");
	}
	public void Test(long a, int b)
	{
		System.out.println("calling long and int");
	}
	public void Test(int a, double b)
	{
		System.out.println("calling int and double");
	}
	public void Test(char a, boolean b)
	{
		System.out.println("calling char and boolean");
	}
	public void Test(boolean a, short b)
	{
		System.out.println("calling boolean and short");
	}
	public void Test(boolean a, byte b)
	{
		System.out.println("calling boolean and byte");
	}
}


public class AdvanceOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AOL a = new AOL();
		a.Test(10l, 20);
		a.Test(10, 200f);
		a.Test('h', false);
		a.Test(true, (byte)10);
		

	}

}
