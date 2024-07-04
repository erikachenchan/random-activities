package moochfi.worksheet.hashmaps;

import java.util.HashMap;
import java.util.Objects;

public class Book {
    private String name;
    private int year;
    private String desc;

    public Book(String name, int year, String desc) {
        this.name = name;
        this.year = year;
        this.desc = desc;
    }

    @Override
    public int hashCode() {
//        System.out.println(Objects.hash(name, year, desc));
//        System.out.println("");
        return Objects.hash(name, year, desc);
    }

    public static void main(String[] args) {

        HashMap<Book, String> borrowers = new HashMap<>();

        Book bookObject = new Book("Book Object", 2000, "...");
        borrowers.put(bookObject, "Pekka");
        borrowers.put(new Book("TDD", 1999, "..."), "Arto");

        System.out.println(borrowers.get(bookObject));
        System.out.println(borrowers.get(new Book("Book Object", 2000, "...")));
        System.out.println(borrowers.get(new Book("TDD", 1999, "...")));
    }

}
