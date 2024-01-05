package msh_fahma_malool;

public class lab_array_p2 
{
	public static void main(String[] args)
	{
		int[] one_array = {30, 40 ,80 ,60, 10 , 34 , 97};
		
		int their_maximum = maximum(one_array);
		System.out.println("Their max number is " + their_maximum);
		
		int their_minimum = minimum(one_array);
		System.out.println("Their min number is " + their_minimum);
		
		int their_sum = sum(one_array);
		System.out.println("Their sum is " + their_sum);
		
		int their_average = average(one_array);
		System.out.println("Their average is " + their_average);
	}
	
	public static int maximum(int[]an_array)
	{
		int max = an_array[0];
		for (int i = 1 ; i < an_array.length ; i++)
		{
			if (an_array[i] > max)
			{
				max = an_array[i];
			}
		}
		return max;
	}
	
	public static int minimum(int[]an_array)
	{
		int min=an_array[0];
		for (int i = 1 ; i < an_array.length ; i++)
		{
			if (an_array[i] < min)
			{
				min = an_array[i];
			}
		}
		return min;
	}
	
	public static int sum(int[]an_array)
	{
		int sum = 0;
		for (int i = 0 ; i < an_array.length ; i++)
		{
			sum+= an_array[i];
		}
		return sum;
	}
	
	public static int average(int[]an_array)
	{
		int sum_of_all = 0 ;
		for (int i = 0 ; i < an_array.length ; i++)
		{
			sum_of_all += an_array[i];	
		}
		int average = sum_of_all / an_array.length;
		return average;
	}
	
	

}
