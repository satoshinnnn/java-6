public class Employee {

    // ===== Thuộc tính =====
    private String id;
    private String name;
    private double salary;

    // ===== 1. Constructor không tham số =====
    public Employee() {
        this.id = "Unknown";
        this.name = "Unknown";
        this.salary = 0;
    }

    // ===== 2. Constructor có mã và tên =====
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
        this.salary = 0;
    }

    // ===== 3. Constructor đầy đủ thông tin =====
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // ===== Phương thức hiển thị =====
    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("------------------------");
    }

    // ===== Main test =====
    public static void main(String[] args) {

        // Tạo bằng constructor không tham số
        Employee e1 = new Employee();

        // Tạo bằng constructor 2 tham số
        Employee e2 = new Employee("E01", "Alice");

        // Tạo bằng constructor 3 tham số
        Employee e3 = new Employee("E02", "Bob", 1500);

        System.out.println("=== Employee 1 ===");
        e1.displayInfo();

        System.out.println("=== Employee 2 ===");
        e2.displayInfo();

        System.out.println("=== Employee 3 ===");
        e3.displayInfo();
    }
}