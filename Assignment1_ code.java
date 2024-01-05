import java.util.Scanner;
	import java.text.NumberFormat;

	public class Assignment2 {
	    public static void main(String[] args) {
	        final double HAMBURGER_PRICE = 2.75;
	        final double CHEESEBURGER_PRICE = 3.25;
	        final double FRIES_PRICE = 2.50;
	        final double DRINK_PRICE = 1.50;

	        Scanner input = new Scanner(System.in);
	        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

	        System.out.println("Welcome to the In-N-Out Burger menu:");
	        System.out.println("------------------------------------------------------");
	        System.out.println("Hamburger: " + currencyFormat.format(HAMBURGER_PRICE));
	        System.out.println("Cheeseburger: " + currencyFormat.format(CHEESEBURGER_PRICE));
	        System.out.println("French Fries: " + currencyFormat.format(FRIES_PRICE));
	        System.out.println("Shake & Beverage: " + currencyFormat.format(DRINK_PRICE));

	        System.out.print("How many hamburger(s) would you like to buy? ");
	        int numHamburgers = input.nextInt();

	        System.out.print("How many cheeseburger(s) would you like to buy? ");
	        int numCheeseburgers = input.nextInt();

	        System.out.print("How many French fries would you like to buy? ");
	        int numFries = input.nextInt();

	        System.out.print("How many drinks would you like to buy? ");
	        int numDrinks = input.nextInt();

	        double totalHamburgerCost = numHamburgers * HAMBURGER_PRICE;
	        double totalCheeseburgerCost = numCheeseburgers * CHEESEBURGER_PRICE;
	        double totalFriesCost = numFries * FRIES_PRICE;
	        double totalDrinkCost = numDrinks * DRINK_PRICE;

	        String itemWithHighestTotalCost = "hamburgers";
	        double highestTotalCost = totalHamburgerCost;

	        if (totalCheeseburgerCost > highestTotalCost) {
	            itemWithHighestTotalCost = "cheeseburgers";
	            highestTotalCost = totalCheeseburgerCost;
	        }
	        if (totalFriesCost > highestTotalCost) {
	            itemWithHighestTotalCost = "fries";
	            highestTotalCost = totalFriesCost;
	        }
	        if (totalDrinkCost > highestTotalCost) {
	            itemWithHighestTotalCost = "drinks";
	            highestTotalCost = totalDrinkCost;
	        }

	        double totalOrderCost = totalHamburgerCost + totalCheeseburgerCost + totalFriesCost + totalDrinkCost;
	        int totalItemsOrdered = numHamburgers + numCheeseburgers + numFries + numDrinks;

	        System.out.println("Total cost for the hamburger(s): " + currencyFormat.format(totalHamburgerCost));
	        System.out.println("Total cost for the cheeseburger(s): " + currencyFormat.format(totalCheeseburgerCost));
	        System.out.println("Total cost for the fries: " + currencyFormat.format(totalFriesCost));
	        System.out.println("Total cost for the drink(s): " + currencyFormat.format(totalDrinkCost));
	        System.out.println("The " + itemWithHighestTotalCost + " had the highest total cost.");
	        System.out.println("Total cost for your order: " + currencyFormat.format(totalOrderCost));
	        System.out.println("Total number of item(s) ordered: " + totalItemsOrdered);
	    }
	}

