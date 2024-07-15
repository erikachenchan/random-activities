package moochfi.exercises.storagefacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {


    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        // Retrieve the String Arraylist containing the storage unit
        ArrayList item = this.storageFacility.get(storageUnit);

        // validation if items are null or empty
        if (item.isEmpty() || item == null) { // if item equal to null
            ArrayList<String> empty = new ArrayList<>(); // create arraylist for empty list
            return empty; // will return to arraylist
        } else {
            // return the value of storage unit
            return item;
        }
    }

    /**
     * removes the given item from the given storage unit.
     * if there are several items with the same name, the rest still remain.
     * If the storage unit would be empty after the removal, the method also removes the unit.
     */
    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);
        if (this.storageFacility.get(storageUnit).isEmpty()) {
            this.storageFacility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        // returns the names of the storage units as list e.g a14, g63
        ArrayList<String> storage = new ArrayList<>();

        // loop
        for (String unit : this.storageFacility.keySet()) {
            storage.add(unit);
        }
        return storage;
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

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
