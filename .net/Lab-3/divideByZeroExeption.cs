using System;

public class divideByZeroExeption
{
	//int num1,num2;
	public void HandleExeption(int num1, int num2)
	{
		try
		{
			Console.WriteLine(num1 / num2);
		}
		catch(Exception e)
		{
			Console.WriteLine("Error Occure!!!"+e.Message);
		}
	}
}
