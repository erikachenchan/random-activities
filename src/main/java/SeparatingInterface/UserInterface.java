package SeparatingInterface;

import java.util.Scanner;

public class UserInterface {

    // Create a program that asks user to write words. The program will stop until they write the same word twice. The words have to be stored and can be printed.
    // 1) the program should have start() method that ask user to enter words and will stop if user repeat the words again.
    // 2) the program should have alreadyEntered that returns boolean and this will be use to test the program continuously
    // 3) Create a class called WordSet ass WordSet should contain the method 'boolean contains(String word)', that checks whether the given word is contained in our set of words, and the method 'void add(String word)', that adds the given word into the set.

    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(WordSet set, Scanner scanner) {
        this.scanner = scanner;
        this.wordSet = set;
    }

    private void start() {
        while (true) {
            System.out.print("Enter a word:");
            String word = scanner.nextLine();
            if (wordSet.contains(word)) {
                break;
            }

            this.wordSet.add(word);
        }
        System.out.println("You have entered the word twice!");
    }


    public static void main(String[] args) {
        // declares Scanner
        Scanner scanner = new Scanner(System.in);
        // Creating a new object of the WordSet class and assigning a reference to that object to the variable set.
        WordSet set = new WordSet();
        // reating a new object of the UserInterface class and assigning a reference to that object to the variable userInterface.
        UserInterface userInterface = new UserInterface(set, scanner);
        // starts the main application
        userInterface.start();

        System.out.println();
        //displays the word list
        System.out.println("The words you entered are:");
        set.printWordSet();
    }

}
