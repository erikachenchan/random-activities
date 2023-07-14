package Payment;

public class MainProgramCard {

    public static void main(String[] args) {
        // PART 1
//        PaymentCard mayCard = new PaymentCard(10);
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

//        Part 2
//        PaymentTerminal natwest = new PaymentTerminal();
//
//        double change = natwest.eatAffordably(10);
//        System.out.println("remaining change " + change);
//
//        change = natwest.eatAffordably(5);
//        System.out.println("remaining change " + change);
//
//        change = natwest.eatHeartily(4.3);
//        System.out.println("remaining change " + change);
//
//        System.out.println(natwest);

        // PART 3
        PaymentTerminal barclaysCmd = new PaymentTerminal();

        double change = barclaysCmd.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = barclaysCmd.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = barclaysCmd.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = barclaysCmd.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(barclaysCmd);
    }
}
