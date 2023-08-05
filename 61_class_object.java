class Employee {
    double empID;
    String empName;
    String empAddress;
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
        System.out.println("Identification Number: " + e1.empID);
        System.out.println("Name: " + e1.empName);
        System.out.println("Adderess: " + e1.empAddress);
        System.out.println();
        System.out.println("Identification Number: " + e2.empID);
        System.out.println("Name: " + e2.empName);
        System.out.println("Adderess: " + e2.empAddress);
        System.out.println();
        System.out.println("Identification Number: " + e3.empID);
        System.out.println("Name: " + e3.empName);
        System.out.println("Adderess: " + e3.empAddress);
        System.out.println();
    }
}