package randomexercises.AmusementPark;

public class Person {

    private String name;
    private int weight;
    private int height;


    public Person(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "{ " + name + " ," + height + " , " + weight + " }";
    }
}
