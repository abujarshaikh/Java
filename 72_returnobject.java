class Employee {
    double empId;
    String empName;
    String empAddress;

    Employee createDuplicate() {
        Employee temp = new Employee();
        temp.empId = empId;
        temp.empName = empName;
        temp.empAddress = empAddress;
        return temp;
    }

    void display() {
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
        System.out.println();
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.empId = 1;
        e1.empName = "Mahesh";
        e1.empAddress = "Juhu";
        System.out.println("Displaying values variables of First Object.\n");
        e1.display();
        Employee e2 = new Employee();
        e2.createDuplicate();
        System.out.print("Displaying values variables of Second Object.\n");
        e2.display();

    }
}