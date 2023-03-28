import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the name of the staff:");
        String staffName = scn.nextLine();

        System.out.println("Enter the staff designation:");
        String designation = scn.nextLine();

        System.out.println("Enter the department name:");
        String departmentName = scn.nextLine();

        Staff staff = new Staff(staffName, designation);
        Department department = new Department(departmentName, staff);

        department.displayStaff();
    }
}
