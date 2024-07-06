package moochfi.worksheet.hashmaps.store;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapStoreMulti {


    /***
     * What if we wanted to assign multiple values to a single key, such as multiple phone numbers for a given person?
     * Since keys and values in a hash map can be any variable, it is also possible to use lists as values in a hash map.
     * You can add more values to a single key by attaching a list to the key. Let's change the way the numbers are stored in the following way:
     * */
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("Erika", new ArrayList<>());

        // add a phone number to the list at Pekka
        phoneNumbers.get("Erika").add("122344");
        phoneNumbers.get("Erika").add("566353");

        System.out.println("Erika's numbers are: " + phoneNumbers.get("Erika"));

    }
}
