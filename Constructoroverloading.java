package oops;
class Students
{
	int id;
	String name;
	int age;
	long phno;
Students(int id,String name)
{
	this.id=id;
	this.name=name;
	}
Students (int id,String name,int age)
{
	
	this.id=id;
	this.name=name;
	this.age=age;
	}
Students (int id,String name,int age,long phno)
{
	
	this.id=id;
	this.name=name;
	this.age=age;
	this.phno=phno;
	}
public void display()
{
	System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Age: "+age+"\n"+"Phone: "+phno);
	}
	}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Students s1=new Students(101,"kundan");
		Students s2=new Students(101,"kundan",21);
		Students s3=new Students(101,"kundan",21,7821369710l);
		s1.display();
		
		

	}

}
