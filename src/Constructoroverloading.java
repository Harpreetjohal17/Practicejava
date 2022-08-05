class COL
{
	COL(int a, double b, String s)
	{
		System.out.println("Calling int,double and String ");
	}
	COL(byte a, short b)
	{
		System.out.println("Calling byte and short");
	}
	COL(char a,int b, String c)
	{
		System.out.println("Calling char, int, string");
	}
	/*
	 * COL(int a,float b, String c) {
	 * System.out.println("Calling int,float, string"); }
	 */
	
}
public class Constructoroverloading {

	public static void main(String[] args) {
		COL c = new COL((byte)10, (short)20,"harpreet");
		//COL c1 = new COL('a',20,"happy");
		COL c1 = new COL(10,10.5f,"harpy");
		
	
// is float given priority over double
	}

}
