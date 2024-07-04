package AmusementPark;

public class Main {

    public static void main(String[] args) {

        Amusement waterPark = new Amusement("Waterpark ride", 160);

        Person person = new Person("Jane", 54, 165);
        System.out.println(person.getName() + " height is " + person.getHeight());

        if (waterPark.checkIfAllowedToRid(person)) {
            System.out.println(person.getName() + " may enter the ride.");
        } else {
            System.out.println(person.getName() + " is not permitted to enter the ride.");
        }

        System.out.println(" ");

        Person personTwo = new Person("John", 57, 150);
        System.out.println(personTwo.getName() + " height is: " + personTwo.getWeight());
        if (waterPark.checkIfAllowedToRid(personTwo)) {
            System.out.println(personTwo.getName() + " may enter the ride.");
        } else {
            System.out.println(personTwo.getName() + " is not permitted to enter the ride.");
        }

    }
}
