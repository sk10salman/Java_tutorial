
class One
{
      One(){
		System.out.println("I am constructor base ::::");
	}
	public void print_base()
	{
		System.out.println("Base Class::::");
	}
}
class Two extends One{
	 Two(){
			System.out.println("I am constructor child1 ::::");
		}
	public void print_child1()
	{
		System.out.println("child1 Class::::");
	}
}
class Three extends Two
{
	Three(){
		System.out.println("I am constructor child2 ::::");
	}
	public void print_child2()
	{
		System.out.println("child2 Class::::");
	}
	
}
public class Multilevel_Inheritance {
       public static void main(String args[])
       {
    	   Three obj=new Three();
    	   obj.print_child2();
    	   obj.print_child1();
    	   obj.print_base();
    	  
       }
}
