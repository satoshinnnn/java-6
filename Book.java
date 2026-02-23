public class Book {

    // ===== Thuộc tính =====
    private String bookId;
    private String title;
    private double price;

    // ===== Constructor (tham số trùng tên) =====
    public Book(String bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // ===== Phương thức hiển thị =====
    public void displayInfo() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // ===== Main test =====
    public static void main(String[] args) {

        Book b1 = new Book("B01", "Java Basics", 29.99);

        b1.displayInfo();
    }
}