public class VariableDemo {

    // Instance variable
    int rollNumber = 101;

    // Static variable
    static String college = "MIT";

    public static void main(String[] args) {

        // Local variables
        int age = 21;
        double salary = 50000.75;
        char grade = 'A';
        boolean isActive = true;
        String name = "Suraj";

        // Creating object to access instance variable
        VariableDemo student = new VariableDemo();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Active: " + isActive);

        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("College: " + college);
    }
}