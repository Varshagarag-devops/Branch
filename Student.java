public class Student {
    public static void main(String[] args) {
        Stud student = new Stud("John", 2002);
        student.displayInfo();
    }
}

class Stud {
    String name;
    int birthYear;

    // Constructor to initialize name and birth year
    Stud(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Method to display name and calculate age
    void displayInfo() {
        int currentYear = 2025; // Hardcoded current year
        int age = currentYear - birthYear; // Calculate age

        System.out.println("Name: " + name); // Print the name
        System.out.println("Age: " + age);   // Print the age
    }
}
