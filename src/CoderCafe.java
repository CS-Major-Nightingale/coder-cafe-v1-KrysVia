// File for your Coder Cafe code!

// File for your Coder Cafe code!

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CoderCafe {
    public static void main(String args[]) {
        System.out.println("*****************************************");

        //drinks prices
        double iceMatcha = 4.50; //matcha for the goats
        double iceLatte = 5.30; //ice latte for the baddie
        double Cappuccino = 3.75; // coffee
        double hotChoco = 4.80; // hot chocolate
        double saleTaxes = 0.08875; //taxes
        double serviceFee = 1.21;

        //quantity
        int matchaQuantity = 2;
        int latteQuantity = 4;
        int cappuccinoQuantity = 3;
        int cocoQuantity = 1;


        //Mathing Section

        //total prices
        double matchaTotal = iceMatcha * matchaQuantity;
        double latteTotal = iceLatte * latteQuantity;
        double cappuccinoTotal = Cappuccino * cappuccinoQuantity;
        double chocolateTotal = hotChoco * cocoQuantity;

        //Variables
        double itemQuantity = matchaQuantity + latteQuantity + cappuccinoQuantity + cocoQuantity;


        //total prices
        double subTotal = matchaTotal + latteTotal + cappuccinoTotal + chocolateTotal;
        double afterTax = subTotal * saleTaxes;
        double coderCafeFee = subTotal % (itemQuantity);
        double total = subTotal + afterTax + serviceFee + coderCafeFee;


        //title and Date
        System.out.println("*\t'Welcome to Krystal's Cafe!'\t\t*");

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("*\t\tdd-MMM-yyyy HH:mm:ss\t\t\t*");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);

        //menu print out
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");
        System.out.printf("*\t2 x Ice Matcha:" + "\t\t$%.2f\t\t\t*\n", matchaTotal);
        System.out.printf("*\t4 x Ice Latte:" + "\t\t$%.2f\t\t\t*\n", latteTotal);
        System.out.printf("*\t3 x Cappuccino:" + "\t\t$%.2f\t\t\t*\n", cappuccinoTotal);
        System.out.printf("*\t1 x Hot Chocolate:" + "\t$%.2f\t\t\t*\n", chocolateTotal);
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");
        System.out.printf("*\tSubtotal:" + "\t\t\t$%.2f\t\t\t*\n", subTotal);
        System.out.printf("*\tSales Taxes:" + "\t\t$%.2f\t\t\t*\n", afterTax);
        System.out.printf("*\tService Fee:" + "\t\t$%.2f\t\t\t*\n", serviceFee);
        System.out.printf("*\tCoder Cafe Fee:" + "\t\t$%.2f\t\t\t*\n", coderCafeFee);
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");
        System.out.printf("*\tTotal:" + "\t\t\t\t$%.2f\t\t\t*\n", total);
        System.out.println("*\t\t\t\t\t\t\t\t\t\t*");

        //message to user
        System.out.println("*\tThank you for shopping with us!\t\t*");
        System.out.println("*****************************************");

        // Good Luck!
    }
}