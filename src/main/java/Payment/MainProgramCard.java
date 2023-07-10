package Payment;

public class MainProgramCard {

    public static void main(String[] args) {
        PaymentCard mayCard = new PaymentCard(10);

        System.out.println("money " + mayCard.getBalance());

        boolean wasSuccessful = mayCard.takeMoney(8);
        System.out.println("successfully took: " + wasSuccessful);

        System.out.println("money " + mayCard.getBalance());

        wasSuccessful = mayCard.takeMoney(4);
        System.out.println("successfully took: " + wasSuccessful);

        System.out.println("money " + mayCard.getBalance());


    }
}
