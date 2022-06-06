public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeeprice = 2.0;
        double lattePrice = 6.0;
        double cappuccinoPrice = 5.0;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        //Cindy
        System.out.println(generalGreeting + customer1); 
        System.out.println(readyMessage + customer1);

        //Noah
        if (isReadyOrder4) {
            System.out.println(readyMessage + customer4 + displayTotalMessage + cappuccinoPrice);

        }
        //Sam
        System.out.println(customer2 + displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }
        //Jimmy
        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffeeprice));


    }
        

}