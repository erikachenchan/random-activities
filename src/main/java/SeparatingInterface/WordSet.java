package SeparatingInterface;

import java.util.ArrayList;

public class WordSet {

    // this class should have the method name add() that allows the user input to be stored in the arrayList.
    // the class should have contains() method that check if the word is already in the arraylist

    private ArrayList<String> wordSet;

    public WordSet() {
        this.wordSet = new ArrayList<>();
    }

    public void add(String word) {
        this.wordSet.add(word);
    }

    public boolean contains(String word) {
        return this.wordSet.contains(word);
    }

    // print arrayList for test to check.
    public void printWordSet() {
        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}
