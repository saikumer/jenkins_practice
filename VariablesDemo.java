class VariablesDemo{
	int marks=100;
	//marks =90; here reinitilazationn is not worked
public static void main (String args[])
{
System.out.println("this is variable demo class ");
int a=10,b=20,c=-20,d=1000;// here d value is not intiallized first
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
int absum=a+b;
c=absum;
System.out.println(a);
System.out.println(b);
System.out.println(c);
student student1 = null;
System.out.println(student1);
}
}