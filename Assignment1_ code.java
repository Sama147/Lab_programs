
import java.util.Scanner;   	 //Calling for scanner from Java library to read user input

public class Assignment1{
	

	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);               //Utilizing scanner to save input entered by the user
		System.out.print("Enter the bill amount: $");           //User enters bill amount
		double bill= scanner.nextDouble();                      //assigning entered bill in variable bill
		
		System.out.print("What percent would you like to tip: ");//User enters percent of the tip
		double tip_percent=scanner.nextDouble();                 //Assigning entered value in variable tip
		
		double tip=(bill*tip_percent)/100;                       //variable calculating tip percent
		System.out.println("Tip Amount: $" + tip ); //printing out the tip amount 
		double total= tip+ bill;                         //variable with calculated total amount of bill
		System.out.println("Total amount with tip: $"+ total);   //printing out total bill 
		
    }
}



 
