package moochfi.exercises.dictmanytrans;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTrans {

    private HashMap<String, ArrayList<String>> dictionary;

    private DictionaryOfManyTrans() {
        this.dictionary = new HashMap<>();
    }

    /**
     * Adds the translation for the word and preserves old translation
     */
    public void add(String word, String translation) {
        // an empty list has to be added for a new user if one has not already been added
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        // get word as argument from the hashmap,then add the word translation to the arrayList.
        this.dictionary.get(word).add(translation);
    }

    /**
     * returns a list of the translations added for the word.
     * If the word has no translations, the method should return an empty list.
     */
    public ArrayList<String> translate(String word) {
        // let's first retrieve the list containing the item and get all word
        ArrayList item = this.dictionary.get(word);
        if (item == null) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        } else {
            return this.dictionary.get(word);
        }
    }

    /**
     * removes the word and all its translations from the dictionary.
     */
    public void remove(String word) {
        this.dictionary.remove(word);


    }

    public static void main(String[] args) {
        DictionaryOfManyTrans dictionary = new DictionaryOfManyTrans();

        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }

}
