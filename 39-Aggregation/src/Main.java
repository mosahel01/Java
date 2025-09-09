public class Main {
    public static void main(String[] args) {

        // Aggregations -> Represent a "has-a" relationship b/w objects
        //
        // one object contains another object as part of its structure
        // but the contained object/s can exists independently

        Book book1 = new Book("The fellow of the ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book books[] = { book1, book2, book3 };

        // for (Book book : books) {
        // System.out.println(book.displayInfo());
        // System.out.println("hello from dvorak layout");
        // }

        Library library = new Library("NYC public library", 1897, books);

        library.displayInfo();

        // System.out.println(book1.displayInfo());
        // System.out.println(book2.displayInfo());
        // System.out.println(book3.displayInfo());

    }
}
