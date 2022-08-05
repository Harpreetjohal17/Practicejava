
public class Employer {
	String name;
	int age;
	float salary;
	
	Employer(String name,float salary, int age)
	{
		this(); // Calling default constructor from parameterized constructor
		this.name = name; //this keyword refers to current class instance variable
		this.salary= salary; //this keyword refers to current class instance variable
		this.age= age; //this keyword refers to current class instance variable

	}
	Employer()
	{
	
		System.out.println("default constructor");
	}
	void display()
	{
		this.show(); // this keyword to invoke current class method
		System.out.println(name + " " + age + " " + salary );
	}
	void show()
	{
		System.out.println("This method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employer e = new Employer("Harpreet", 90000, 28);
		Employer e1 = new Employer("Pardeep", 80000, 29);
		e.display();
		e1.display();

	}

}
