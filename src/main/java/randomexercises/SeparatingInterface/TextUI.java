package SeparatingInterface;

import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                simpleDictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String translated = scanner.nextLine();
                String returnTranslation = simpleDictionary.translate(translated);
                if (returnTranslation == null) {
                    System.out.println("Word " + translated + " was not found");
                } else {
                    System.out.println(returnTranslation);
                }
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
}
