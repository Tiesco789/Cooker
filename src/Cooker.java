import java.util.Scanner;

public class Cooker {
    public static void main(String[] args) {
        int eggsAmount, eggsMin = 1, milkAmount, milkMin = 200, flourAmount, flourMin = 100;

        System.out.println("Hello Boris!");
        System.out.println("BlinMAKER is starting UP...");

        System.out.println("How many eggs you have?");

        Scanner userInput;
        userInput = new Scanner(System.in);
        eggsAmount = userInput.nextInt();
        System.out.println("You have " + eggsAmount + " eggs");
        // eggs done

        // System.out.println("How much milk you have?");
        userInput = new Scanner(System.in);
        milkAmount = userInput.nextInt();
        // System.out.println("You have " + milkAmount + " ml milk");

        System.out.println("How much flour you have?");
        userInput = new Scanner(System.in);
        flourAmount = userInput.nextInt();
        // System.out.println("You have " + flourAmount + "g flour");

        // Main code here
        if(eggsAmount < eggsMin || milkAmount < milkMin || flourAmount < flourMin) {
            System.out.println("No blin today :(");
        } else {
            flourAmount = flourAmount / flourMin;
            // System.out.println("you have " + flourAmount + " portions of flour");

            milkAmount = milkAmount / milkMin;
            // System.out.println("you have " + milkAmount + " portions of milk");

            // find smallest number of all
            int smallest;

            if (eggsAmount <= milkAmount && milkAmount <= flourAmount) {
                smallest = eggsAmount;
            } else if (milkAmount <= flourAmount && milkAmount <= eggsAmount) {
                smallest = milkAmount;
            } else {
                smallest = flourAmount;
            }

            System.out.println(" "); // every portion is blin
            System.out.println("You can make " + smallest*4 + " portions of blins");
            System.out.println(" ");
            System.out.println("You'll need " + smallest * eggsMin + " eggs");
            System.out.println("You'll need " + smallest * flourMin + " grams flour");
            System.out.println("You'll need " + smallest * milkMin + "ml milk");
            System.out.println(" ");
            System.out.println("Blinkmaker shutting down...");
    }
    }
}
