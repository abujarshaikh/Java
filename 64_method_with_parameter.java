class Employee {
    double empId;
    String empName;
    String empAddress;

    void parameter(double id, String n, String addr) {
        empId = id;
        empName = n;
        empAddress = addr;
    }

    void Display() {
        System.out.println("Identification Number: " + empId);
        System.out.println("Name:" + empName);
        System.out.println("empAddress: " + empAddress);
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.parameter(1, "Mahesh", "Juhu");

        Employee e2 = new Employee();
        e2.parameter(2, "Dinesh", "Palghar");

        System.out.println("Employee Detailes");
        e1.Display();
        System.out.println();
        e2.Display();
    }
}