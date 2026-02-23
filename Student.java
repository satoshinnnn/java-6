public class Student {
    private String id;
    private String name;
    private int yearBond;
    private double gpa;

    public Student(String id, String name, int yearBond, double gpa) {
        this.id = id;
        this.name = name;
        this.yearBond = yearBond;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("year bond: " + this.yearBond);
        System.out.println("GPA: " + this.gpa);
    }

    public static void main(String[] args) {
        Student st1 = new Student("2010", "Bao Khanh", 2006, 3.5);
        Student st2 = new Student("2010", "Bao Khanh", 2006, 3.5);

        st1.displayInfo();
        st2.displayInfo();
    }
}