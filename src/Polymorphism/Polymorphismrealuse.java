package Polymorphism;

class Plant
{
	public void indoorplant()
	{
		System.out.println("Grows well");
	}
	final public void Homedepot()
	{
		System.out.println("Fresno");
	}
}
class ZZplant extends Plant
{
	public void indoorplant()
	{
		
		System.out.println("Water once a week");
	}

}
class Snakeplant extends Plant
{
	public void indoorplant()
	{
		System.out.println("Water once in 2 weeks");
	}
	public void getproduct()
	{
		System.out.println("product details");
	}
}
class Goldenpothos extends Plant
{
	public void indoorplant()
	{
		System.out.println(" Need less water ");
	}
}
public class Polymorphismrealuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant p = new Snakeplant(); // Upcasting
		p.indoorplant();
		p.Homedepot();
	

	}

}
