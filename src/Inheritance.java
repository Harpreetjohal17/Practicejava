
class GP
{
	public void GPFeature()
	{
		System.out.println("Calling GP");
	}
}

class Parents extends GP
{
	
	
	public void ParentFeature()
	{
		System.out.println("calling Parent Feature");
	}
}

class Child extends Parents
{
	
	
	public void ChildFeature()
	{
		System.out.println("calling Child feature");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c = new Child();
		c.ChildFeature();
		c.ParentFeature();
		c.GPFeature();

	}

}
