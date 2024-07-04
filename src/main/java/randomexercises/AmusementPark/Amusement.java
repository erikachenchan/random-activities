package AmusementPark;

public class Amusement {

    private String name;
    private int lowestHeight;

    public Amusement(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLowestHeight() {
        return lowestHeight;
    }

    public void setLowestHeight(int lowestHeight) {
        this.lowestHeight = lowestHeight;
    }

    public boolean checkIfAllowedToRid(Person person) {
        if (person.getHeight() < this.getLowestHeight()) {
            return false;
        }
        return true;
    }
}
