// File for your Coder Cafe code!

// File for your Coder Cafe code!

public class CoderCafe {
    public static void main(String args[]) {
        System.out.println("*************************************************");
        //here are some drinks prices
        // test commit
        double iceMatcha = 4.50; //matcha for the goats
        double iceLatte = 5.30; //ice latte for the baddie
        double Cappuccino = 3.75; // coffee
        double hotChoco = 4.80; //coco
        double saleTaxes = 0.08875; //taxes
        double serviceFee = 1.21;
        //quanity
        int matchaQuanity = 2;
        int latteQuanity = 4;
        int cappuccinoQuanity = 3;
        int cocoQuanity = 1;


        //mathing
        double matchaTotal = iceMatcha * matchaQuanity;
        double latteTotal = iceLatte * latteQuanity;
        double cappuccinoTotal = Cappuccino * cappuccinoQuanity;
        double chocolateTotal = hotChoco * cocoQuanity;

        double subTotal = matchaTotal + latteTotal + cappuccinoTotal + chocolateTotal;
        double afterTax = subTotal * saleTaxes;
        double coderCafeFee = subTotal % (matchaQuanity + latteQuanity + cappuccinoQuanity + cocoQuanity);
        double total = subTotal + afterTax + serviceFee + coderCafeFee;

        //menu
        System.out.printf("*      2 x Ice Matcha:" + "$ %.2f\t\t\t\t\t*\n", matchaTotal);
        System.out.printf("*      4 x Ice Latte:" + "$%.2f\t\t\t\t\t\t*\n", latteTotal);
        System.out.printf("*      3 x Cappuccino:" + "$%.2f\t\t\t\t\t*\n", cappuccinoTotal);
        System.out.printf("*      1 x Hot Chocolate:" + "$%.2f\t\t\t\t\t*\n", cappuccinoTotal);
        System.out.println("*                                               *");
        System.out.printf("*      Subtotal:" + "$%.2f \t\t\t\t\t\t\t*\n", subTotal);
        System.out.printf("*      Sales Taxes:" + "$%.2f\t\t\t\t\t    *\n", afterTax);
        System.out.printf("*      Service Fee:" + "$%.2f\t\t\t\t\t\t*\n", serviceFee);
        System.out.printf("*      Coder Cafe Fee:" + "$%.2f\t\t\t\t\t\t*\n", coderCafeFee);
        System.out.println("*                                               *");
        System.out.printf("*      Total:" + "$ %.2f\t\t\t\t\t\t    *\n", total);
        System.out.println("*                                               *");


        // Good Luck!
    }
}