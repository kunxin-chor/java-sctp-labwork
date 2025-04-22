import java.util.ArrayList;
import java.util.Scanner;

// Rule of thumb: all member variables and method must be static in Main
public class Main {

    // STATIC = WHAT IS STATIC
    // Static = all instances of the classes share that variable
    // It exists even without creating an instance of the class
    // Java doesn't create an instance of Main when you run the program
    // It just directly call Main.main()
    // static methods can only refer or use static variables and static methods
    public static Scanner sc;

   
    // static methods can only access static stuff
    public static ArrayList<Product> productDatabase;

    public static void main(String[] args) {

        testProducts();

        // Create an empty ArrayList of product
        productDatabase = new ArrayList<Product>();
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("Menu:");
            System.out.println("1. See all products");
            System.out.println("2. Add a new product");
            System.out.println("3. Update a product");
            System.out.println("4. Delete a product");
            System.out.println("5. Quit");
            int choice = sc.nextInt();
            sc.nextLine(); // clear input buffer
            if (choice == 1) {
                showProducts();
            }
            if (choice == 2) {
                addProduct();
            }
            if (choice == 3) {
                System.out.println("Update a product");
            }
            if (choice == 4) {
                System.out.println("Delete a product");
            }
            if (choice == 5) {
                break;
            }

        }

    }

    public static void showProducts() {
        System.out.println("See All Products");
        for (Product p : productDatabase) {
            System.out.println(p);
        }
    }

    public static void addProduct() {
        System.out.println("Add a New Product");
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("SKU: ");
        String sku = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // clear buffer
        System.out.println("Type of product? D=Digital, P=Physical");
        String productType = sc.next();
        sc.nextLine(); // clear 
        if (productType.toLowerCase().equals("d")) {
            // adding a new digital product
            System.out.println("Enter the file format");
            String fileFormat = sc.nextLine();
            System.out.println("Enter the download link");
            String downloadLink = sc.nextLine();

            DigitalProduct product = new DigitalProduct(name, sku, price, fileFormat, downloadLink);
            productDatabase.add(product);

        } else {
            // adding a new physical product
        }


    }

    public static void testProducts() {
        Product p = new Product();
        p.setName("Ninentodo Switch");
        p.setSku("NIN123");
        p.setPrice(500);
        System.out.println(p);

        // System.out.println(p.getName());
        // System.out.println(p.getSku());
        // System.out.println(p.getPrice());

        Product p2 = new Product();
        System.out.println(p2);

        Product p3 = new Product("PSOne", "PS01", 600);
        System.out.println(p3);
        p3.setName("Xbox one");

        PhysicalProduct book = new PhysicalProduct("Test Book", "B001", 25.5, "10cmx20cm", 200, "black");
        System.out.println(book);

        DigitalProduct game = new DigitalProduct("Assassin Creed", "ARC01", 50, "zip", "https://fake.file/ac");
        System.out.println(game);
    }
}