package exception_handling;

import java.util.Scanner;


 class Error_handling 
{
	public int check(int x) throws Exception
	{
		if(x<0)
			throw new Exception ( "n should be positive");
		return x;
	}
}


public class Try_Catch_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//method1 inbulit Exception
		
		int n,m;
		System.out.println("enter the value and divider: ");
		n=sc.nextInt();
		m=sc.nextInt();
		try
		{
			System.out.println(new Error_handling().check(n));
			System.out.println("a/b=  : "+ n/m);
			System.out.println("after error check");
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero error");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
   sc.close();
	}

}
