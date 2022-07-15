class Animal
{
	public void Category()
	{
		System.out.println("Animal ");
	}
}

class Tiger extends Animal
{
	public void Voice()
	{
		System.out.println("Roaring");
	}
}

class Dog extends Animal
{
	public void Voice()
	{
		System.out.println("Barking");
	}
}

class Cat extends Animal
{
	public void Voice()
	{
		System.out.println("Meow");
	}
}
public class ManyToOneInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger t = new Tiger();
		t.Voice();
		t.Category();

	}

}
