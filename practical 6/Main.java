class Book {
    String title;
    String author;
    double price;
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James Gosling", 450.0);
        Book b3 = new Book(b2);
        System.out.println("BEFORE MODIFYING THE COPY ");
        System.out.println("b1 (no-argument):");
        b1.display();
        System.out.println("b2 (parameterized):");
        b2.display();
        System.out.println("b3 (copy of b2):");
        b3.display();
        b3.title = "Advanced Java";
        b3.price = 600.0;
        System.out.println("\nAFTER MODIFYING THE COPY (b3)");
        System.out.println("b2 (original):");
        b2.display();
        System.out.println("b3 (modified copy):");
        b3.display();
    }
}