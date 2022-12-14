package oops;

class Student
{
	int roll;
	String name;
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
		}
	void display()
	{
		System.out.println("Roll: "+roll+"name: "+name);
	}
	}

public class ParameterizeConstructor {

	public static void main(String[] args) {
		Student kundan=new Student(101,"kundan");
		kundan.display();
		Student kundan=new Student(102,"kundan");
		kundan.display();
		
	}

}
