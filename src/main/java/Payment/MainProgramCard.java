package Payment;

public class MainProgramCard {

    public static void main(String[] args) {
//        PaymentCard mayCard = new PaymentCard(10);
//
//        System.out.println("money " + mayCard.getBalance());
//
//        boolean wasSuccessful = mayCard.takeMoney(8);
//        System.out.println("successfully took: " + wasSuccessful);
//
//        System.out.println("money " + mayCard.getBalance());
//
//        wasSuccessful = mayCard.takeMoney(4);
//        System.out.println("successfully took: " + wasSuccessful);
//
//        System.out.println("money " + mayCard.getBalance());

        PaymentTerminal natwest = new PaymentTerminal();

        double change = natwest.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = natwest.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = natwest.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(natwest);
    }
}
