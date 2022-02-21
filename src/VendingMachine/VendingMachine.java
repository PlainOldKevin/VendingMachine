package VendingMachine;

import java.util.ArrayList;

public class VendingMachine {
    //kevin make snacks here
	private static Snack KitKat = new Snack("KitKat", 1.50);
	private static ArrayList<Snack> snacks = new ArrayList<Snack>();

    public static void main (String[] args){
        //jack write user greeting & snack display here
        snacks.add(KitKat);

        System.out.println("Welcome to the vending machine!");
        System.out.println("Snack options are: ");
        for(int i=0; i<snacks.size(); i++){
            System.out.println((i+1) + ": " + snacks.get(i).getName() + ", " + snacks.get(i).getPrice());
        }

    }
}
