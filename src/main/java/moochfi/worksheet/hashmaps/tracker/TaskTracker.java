package moochfi.worksheet.hashmaps.tracker;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker {
    private final HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercises) {
        // an empty list has to be added for a new user if one has not been already added
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // let's first retrieve the list containing the exercises completed by the user and add to it.
        ArrayList<Integer> completed = this.completedExercises.get(user);
        completed.add(exercises);
    }

    public void print() {
        for (String name : completedExercises.keySet()) {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }

    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);
        tracker.add("Ada", 3);
        tracker.add("Ada", 3);

        tracker.add("Pekka", 4);
        tracker.add("Pekka", 4);

        tracker.add("Matti", 1);
        tracker.add("Matti", 2);

        tracker.print();
    }
}

