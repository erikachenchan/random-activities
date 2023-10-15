package SeparatingInterface;

import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translation;

    public SimpleDictionary() {
        this.translation = new HashMap<>();
    }

    public String translate(String word) {
        return "Translation: " + this.translation.get(word);
    }

    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }

    // test to check if every element are present
    public void printHashMap() {
        System.out.println(translation);

    }

    // test to check the numbers of element
    public void sizeValue() {
        System.out.println("Size : " + translation.size());
    }
}
