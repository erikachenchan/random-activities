package moochfi.worksheet.hashmaps;

import java.util.HashMap;

public class Book {
    private String name;
    private Integer published;
    private String desc;

    public Book(String name, Integer year, String desc) {
        this.name = name;
        this.published = year;
        this.desc = desc;
    }

    public Book(String name, Integer year) {
        this.name = name;
        this.published = year;
    }

//    @Override
//    public int hashCode() {
////        System.out.println(Objects.hash(name, year, desc));
//        //return numbers = objects
//        return Objects.hash(name, published, desc);
//    }

    @Override
    public int hashCode() {
        if (this.name == null) {
//            System.out.println(this.published);
            return this.published;
        }

//        System.out.println(this.published + this.name.hashCode());
        return this.published + this.name.hashCode();
    }

    public static void main(String[] args) {

        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka"); // Book object, String object
        borrowers.put(new Book("Test Driven Development", 1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new Book("Test Driven Development", 1999)));
    }

}
