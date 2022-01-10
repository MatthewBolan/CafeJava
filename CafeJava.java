
public class CafeJava {

    public static void main(String[] args) {

        // APP VARIABLES

        // Lines of text that will appear in the app. 

        String generalGreeting = "Welcome to Cafe Java, ";

        String pendingMessage = " your order will be ready shortly";

        String readyMessage = " your order is ready";

        String displayTotalMessage = " Your total is $";
        
        // Menu variables (add yours below)

        double mochaPrice = 3.5;

        int dripCoffee = 1;

        double latte = 5.55;

        double cappuccino = 7.35;
    
        // Customer name variables (add yours below)

        String customer1 = "Cindhuri";

        String customer2 = "Sam";

        String customer3 = "Jimmy";

        String customer4 = "Noah";

        
    
        // Order completions (add yours below)

        boolean isReadyOrder1 = false;

        
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // Example:

        System.out.println();

        System.out.println(generalGreeting + customer1);     // Displays "Welcome to Cafe Java, Cindhuri"

        System.out.println();

    	// ** Your customer interaction print statements will go here ** //

        System.out.println(customer1 + pendingMessage);

        for (int x=0; x<3; x++) {


        String customer[] = {"Sam","Jimmy","Noah"};

        boolean isReadyOrder[] = {true, false, true};



            if (isReadyOrder[x]) {

                System.out.println();

                System.out.println(generalGreeting + customer[x] + readyMessage);

            }

            else {

                System.out.println();

                System.out.println(generalGreeting + customer[x] + pendingMessage);

            }

        }

        System.out.println();

        System.out.println(customer4 + displayTotalMessage + cappuccino);

        System.out.println();

        System.out.println(customer2 + displayTotalMessage + latte*2);

        System.out.println();

        System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));

        System.out.println();

        System.out.println(customer1 + displayTotalMessage + dripCoffee);

        System.out.println();

    }

}
