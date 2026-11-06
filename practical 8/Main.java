class Product {
    String name;
    double price;
    int quantity;
    Product() {
        name = "Unknown";
        price = 0.0;
        quantity = 0;
    }
    Product(String name) {
        this.name = name;
        price = 0.0;
        quantity = 0;
    }
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double calculateTotal() {
        return price * quantity;
    }
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Total: " + calculateTotal());
    }
}
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();            
        Product p2 = new Product("Pen");               
        Product p3 = new Product("Notebook", 50.0);   
        Product p4 = new Product("Bag", 800.0, 3);    
        System.out.println("1. No-argument constructor:");
        p1.display();
        System.out.println("2. Name-only constructor:");
        p2.display();
        System.out.println("3. Name and price constructor:");
        p3.display();
        System.out.println("4. All-fields constructor:");
        p4.display();
    }
}