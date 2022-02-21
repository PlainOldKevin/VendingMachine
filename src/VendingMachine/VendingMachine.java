package VendingMachine;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    //kevin make snacks here
	private static Snack KitKat = new Snack("KitKat", 1.50);
	private static Snack PotatoChips = new Snack("Potato Chips", 2.00);
	private static Snack Poptart = new Snack("Strawberry Poptart", 2.50);
	private static Snack Snickers = new Snack("Snickers", 1.00);
	private static Snack Oreos = new Snack("Oreos", 1.50);
	private static Snack SlimJim = new Snack("Slim Jim", 1.50);
	private static Snack Gatorade = new Snack("Gatorade", 2.00);
	
	private static ArrayList<Snack> snacks = new ArrayList<Snack>();

    public static void main (String[] args){
    	
    	//initialize Scanner
    	Scanner sc = new Scanner(System.in);
    	
        //jack write user greeting & snack display here
        snacks.add(KitKat);
        snacks.add(PotatoChips);
        snacks.add(Poptart);
        snacks.add(Snickers);
        snacks.add(Oreos);
        snacks.add(SlimJim);
        snacks.add(Gatorade);

        System.out.println("Welcome to the vending machine!");
        System.out.println("Snack options are: ");
        for(int i=0; i<snacks.size(); i++){
            System.out.println((i+1) + ": " + snacks.get(i).getName() + ", " + snacks.get(i).getPrice());
        }
        System.out.println("Enter the number for your snack selection.");
        int userInput = sc.nextInt();

    }
}
