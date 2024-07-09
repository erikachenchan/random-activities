package moochfi.worksheet.hashmaps.keysetex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class KeySetExercise {


    public static void main(String[] args) {
        // Create a HashMap and populate it with key-value pairs
        HashMap<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Get the set of keys from the HashMap using keySet()
        Set<String> keySet = map.keySet();

        // Create an ArrayList from the key set
        ArrayList<String> keyList = new ArrayList<>(keySet);

        // Print the ArrayList to verify the keys
        System.out.println("Keys in the HashMap: " + keyList);
    }

}
