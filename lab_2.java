import java.util.Scanner;
public class lab_2 {
 public static void main(String[]args) 
 {
	 Scanner scan = new Scanner (System.in);
	 double num1,num2,sum,minus,times,divide,remainder;
	 int i,j;
	 
	 System.out.println("Enter first number");
	 num1=scan.nextDouble();
	 
	 System.out.println("Enter second number");
	 num2=scan.nextDouble();
	 
	 sum= num1 + num2;
	 minus= num1 - num2;
	 times= num1 * num2;
	 divide= num1 / num2;
	 remainder= num1 % num2;
	 
	 System.out.println("sum is " + sum);
	 System.out.println("difference is "+minus);
	 System.out.println("product is "+times);
	 System.out.println("division is "+divide);
	 System.out.println("remainder is" + remainder);
	 
	 /*
	 for (i=0; i<=4; i++) 
	 {
		 for (j=0; j<=4; j++)
		 {
			 System.out.print("*");
		 }
		 System.out.print("*");
	 }
	 */
 }
	
}

