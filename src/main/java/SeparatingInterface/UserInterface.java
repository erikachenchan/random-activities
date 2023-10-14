package SeparatingInterface;

import java.util.Scanner;

public class UserInterface {

    // Create a program that asks user to write words. The program will stop until they write the same word twice. The words have to be stored and can be printed.
    // 1) the program should have start() method that ask user to enter words and will stop if user repeat the words again.
    // 2) the program should have alreadyEntered that returns boolean and this will be use to test the program continuously
    // 3) Create a class called WordSet ass WordSet should contain the method 'boolean contains(String word)', that checks whether the given word is contained in our set of words, and the method 'void add(String word)', that adds the given word into the set.

    public UserInterface(WordSet set, Scanner scanner) {

    }

    private void start() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }

}
