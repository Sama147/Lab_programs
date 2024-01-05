package msh_fahma_malool;
import java.util.Random;
import java.util.Scanner;

public class lab_week12 
{
	public static void main(String[]args)
	{
		int[] nums_array = {100,200,300,400,500,600,700,800};
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number to be found");
		int number = scanner.nextInt();
		
		int x = binarySearch(nums_array, number);
		if(x==-1)
			System.out.println("number not found" );
		else
		System.out.println("The index is: " + x);	
	}
	
	public static int binarySearch(int[] an_array, int target)
	{
	   int first =0;
	   int last =( an_array.length - 1);
	   int mid;
	   while (first <= last) 
	   {
	      mid = (first + last)/2;
	      if (target == an_array[mid])
	       	  return mid;
	      else if (target < an_array[mid])
	         	            last = mid - 1;
	      else // must be that target > a[mid]
	         	            first = mid + 1;
	   }
	   return -1; //use -1 to indicate item not found
	}
}
