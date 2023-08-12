class Employee {
    double empID;
    String empName;
    String empAddress;

    void Display() {
        System.out.println("Identification Number: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Adderess: " + empAddress);
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.empID = 1;
        e1.empName = "Mahesh";
        e1.empAddress = "Juhu";

        Employee e2 = new Employee();
        e2.empID = 2;
        e2.empName = "Dinesh";
        e2.empAddress = "Palghar";

        Employee e3 = new Employee();
        e3.empID = 3;
        e3.empName = "Binod";
        e3.empAddress = "Haveli";

        System.out.println("Employee Details\n");
        e1.Display();
        System.out.println();
        e2.Display();
        System.out.println();
        e3.Display();

    }
}