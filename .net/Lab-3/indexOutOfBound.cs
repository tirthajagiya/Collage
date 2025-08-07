using System;

public class indexOutOfBound
{
	public void takeInupt()
	{
		try
		{
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++)
            {
                Console.WriteLine("Enter Input: ");
                arr[i] = Convert.ToInt16(Console.ReadLine());
            }
            for (int i = 0; i < 7; i++)
            {
                Console.WriteLine(arr[i]);
            }
        }
        catch(IndexOutOfRangeException e)
        {
            Console.WriteLine("Error is a : " + e.Message);
        }
	}
}
