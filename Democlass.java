import java.util.*;
class DemoClass
{
public int Math(int a, int b)
{
int sum=0; 
sum=a+b;
System.out.println("addition="*+sum);
return sum;
}
Public static void main(String args[])
{
int no1,no2,f;
Scanner z=new Scanner(System.in);
System.out.println("Enter a no");
no2=z.nextInt();
DemoClass obj =new DemoClass();
f=obj.Math(no1,no2);
System.out.println(f)
}
}
