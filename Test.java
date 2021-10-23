 class A
{
	 static int a=10;
}
class B extends A
{
	
	static int a=11;	
	}
	
 class C extends B
{
	
}
class D extends B
{
	
}
public class Test
{
	public static void main(String[] args)
	{
		B b=new B();
		//System.out.println(b.a);

		A a=new A();
		//System.out.println(a.a);
		
		A a1=new B();
		//System.out.println(a1.a);
		B b1=(B)new A();
		
	}
}
	










