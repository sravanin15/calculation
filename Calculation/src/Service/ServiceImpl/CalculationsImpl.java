package Service.ServiceImpl;

import Service.Calculations;

public class CalculationsImpl implements Calculations  {
	public void add(int a,int b)
	{
		System.out.println("Addition :"+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Subtraction:"+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Multiplication:"+a*b);
	}
	public void div(int a,int b)
	{
		try
		{
			System.out.println("Division:"+a/b);
		}
		catch(ArithmeticException e)
		{
			e.getMessage();
		}
		
	}
}
