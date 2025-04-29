class Course {
    String semester;
    String[] courseNames;
    int[] marks;

    // Constructor to initialize semester, course names, and marks
    Course(String semester, String[] courseNames, int[] marks) {
        this.semester = semester;
        this.courseNames = courseNames;
        this.marks = marks;
    }

    // Method to display the courses and their marks
    void displayCourses() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Course: " + courseNames[i] + ", Marks: " + marks[i]);
        }
    }
}

public class Main {  // Changed class name to Main (or another name)
    public static void main(String[] args) {
        // Initializing course names and marks as arrays
        String[] courses = {"Math", "Physics", "Chemistry"};
        int[] marks = {85, 90, 88};

        // Create a Course object and display courses
        Course course = new Course("Semester 1", courses, marks);
        course.displayCourses();
    }
}
