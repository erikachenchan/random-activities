package moochfi.exercises.storagefacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {


    private HashMap<String, ArrayList<String>> items;

    public StorageFacility() {
        this.items = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.items.putIfAbsent(unit, new ArrayList<>());
        this.items.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        // Retrieve the String Arraylist containing the storage unit
        ArrayList item = this.items.get(storageUnit);

        // validation if items are null or empty
        if (item == null) { // if item equal to null
            ArrayList<String> empty = new ArrayList<>(); // create arraylist for empty list
            return empty; // will return to arraylist
        } else {
            // return the value of storage unit
            return this.items.get(storageUnit);
        }
    }


    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
    }
}
