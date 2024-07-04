package randomexercises.Payment;

public class PaymentTerminal {

    private double money;
    private int affordableMeal;
    private int heartyMeals;

    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTY_PRICE = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable meal and return the change
        // if the payment parameter is not large enough compare the price of affordable meal,
        // no meal is sold and the method should return the whole payment.

        if (payment < AFFORDABLE_PRICE) {
            return payment;
        }

        this.money += AFFORDABLE_PRICE;
        this.affordableMeal++;

        double calculatePrice = payment - AFFORDABLE_PRICE;
        return calculatePrice;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty meal and return the change
        // if the payment parameter is not large enough compare to the hearty meal
        // , no meal is sold and the method should return the whole payment

        if (payment < HEARTY_PRICE) {
            return payment;
        }
        this.money += HEARTY_PRICE;
        heartyMeals++;

        double calculate = payment - HEARTY_PRICE;
        return calculate;

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price,
        // and the method returns true
        // otherwise false is returned

        if (!card.takeMoney(AFFORDABLE_PRICE)) {
            return false;
        }
        this.affordableMeal++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money,
        // the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned

        if (!card.takeMoney(HEARTY_PRICE)) {
            return false;
        }
        this.heartyMeals++;
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum < 0) {
            return;
        }
        card.addMoney(sum);
        // current money + sum
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeal + ", number of sold hearty meals: " + heartyMeals;
    }
}
