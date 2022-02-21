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
        //printing all snacks
        for(int i=0; i<snacks.size(); i++){
            System.out.println((i+1) + ": " + snacks.get(i).getName() + ", " + snacks.get(i).getPrice());
        }
        //snack selection
        System.out.println("Enter the number for your snack selection.");
        int userInput = sc.nextInt()-1;
        System.out.println("Selected " + snacks.get(userInput).getName());
        System.out.println("Price: " + snacks.get(userInput).getPrice());
        //paying for snack
        int userMoney = 0;
        boolean notEnough = false;
        do{
            if(notEnough) System.out.println("Not enough money!");
            System.out.println("Insert money (only $1 bills accepted): ");
            userMoney = sc.nextInt();
            if (userMoney < snacks.get(userInput).getPrice()) notEnough = true;

        }while(userMoney < snacks.get(userInput).getPrice());
        //confirmation
        boolean cancelled = false;
        sc.nextLine();
        System.out.println("Are you sure you would like to complete the transaction? (y/n)");
        String userCancel = sc.nextLine().toLowerCase();
        if(userCancel.equals("n")) {
            cancelled = true;
            System.out.println("Ok! Here is your refund: $" + userMoney);
        }

        if(!cancelled){
            //return change
            double change = userMoney - snacks.get(userInput).getPrice();
            if(change == 0){
                //print closing remarks
            }
            else{
                //print how much change they get
                //closing remarks
            }
        }




    }
}
