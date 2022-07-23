class MOL
{
	public void Test(int a , String b) {
		
		System.out.println("calling int");
		
	}
	
	public void Test(String a ,int b)
	{
		System.out.println("calling String");
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MOL m = new MOL();
		m.Test(10,"Test");

	}

}
