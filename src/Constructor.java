class Cons
{
	 Cons(String a)
	{
		System.out.println("Constructor");
	}
	Cons(int a)
	{
		System.out.println("calling int");
	}
	
	Cons(double b)
	{
		System.out.println("calling double ");
	}
	
	
	public void getDetails()
	{
		System.out.println("calling details");
	}
	
	
	
	
}

class Cons1 extends Cons
{

	Cons1(double b) {
		super(b);
		// TODO Auto-generated constructor stub
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10 ;
		
		// new Cons("Test");
		 new Cons(10);
		 new Cons(10.5).getDetails();
		 
		 Cons c = new Cons(10);
		// c.Cons("Test");
		

	}

}
