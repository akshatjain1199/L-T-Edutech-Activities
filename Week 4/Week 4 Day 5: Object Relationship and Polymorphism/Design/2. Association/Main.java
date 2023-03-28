import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the student name:");
        String studentName = scn.nextLine();

        System.out.println("Enter the register number:");
        Integer registerNo = scn.nextInt();

        System.out.println("Enter the course id:");
        Integer courseId = scn.nextInt();
        scn.nextLine();

        System.out.println("Enter the course name:");
        String courseName = scn.nextLine();

        Course course = new Course(courseId, courseName);
        Student student = new Student(studentName, registerNo);

        student.display(course);
    }
}
