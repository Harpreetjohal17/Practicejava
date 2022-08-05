class KFCAmerica
{
	final public void getProduct()
	{
		System.out.println("KFC Product");
	}
	
	public void Location()
	{
		System.out.println("California");
	}
}

class KFCIndia extends KFCAmerica
{
	public void OtherProduct()
	{
		System.out.println("Other Pizza ");
	}
	
	
	
	public void Location()
	{
		System.out.println("Delhi");
	}
	
}

class KFCUk extends KFCAmerica
{
	public void Location()
	{
		System.out.println("London");
	}
}

public class MethodOveridingRealUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KFCAmerica k = new KFCIndia(); // upcasting
		k.Location();
		k.getProduct();
		
	}

}
