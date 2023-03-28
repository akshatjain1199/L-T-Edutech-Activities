import java.util.*;
class Department {
    private String departmentName;
    private Staff staff;

    public Department(String departmentName, Staff staff) {
        this.departmentName = departmentName;
        this.staff = staff;
    }

    public void displayStaff() {
        System.out.println(staff.getStaffName() + " is working in the " + departmentName + " department as " + staff.getDesignation());
    }
}
