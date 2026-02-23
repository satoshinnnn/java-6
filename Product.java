public class Product {
    private String id;
    private String productName;
    private double price;

    public Product(String id, String productName, double price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Price must be > 0.");
        }
    }

    public void displayInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Product name: " + this.productName);
        System.out.println("Price: " + this.price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("123", "Soap", 12.2);
        Product p2 = new Product("444", "Toothbth", 12.2);

        p1.setPrice(-300);
        p1.displayInfo();
    }
}
