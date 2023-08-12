class Employee {
    double empId;

    void passByReference(Employee e) {
        e.empId = 100;
    }

    void passByValue(double id) {
        id = 1000;
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.empId = 1;
        System.out.println("Initially Object e1's empId has following value: " + e1.empId);
        e1.passByReference(e1);
        System.out.print("After Passing By Reference e1's empId has the following value: " + e1.empId);
        Employee e2 = new Employee();
        e2.empId = 1;
        System.out.println("\nInitially Object e2's empId has following value: " + e2.empId);
        e2.passByValue(1000);
        System.out.print("After Passing By Reference e2's empId has the following value: " + e2.empId);
    }
}