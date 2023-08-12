class Employee {
    double empId;
    String empName;
    String empAddress;

    public Employee() {
        empId = 1;
        empName = "Mahesh";
        empAddress = "Address";

    }

    public Employee(double i, String n, String a) {
        empId = i;
        empName = n;
        empAddress = a;
    }

    public void displayEmpInfo() {
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
    }
}

class permanentEmployee extends Employee {
    double da, hra, basic;
    double salary;

    permanentEmployee(int i, String n, String a, double b) {
        empId = i;
        empName = n;
        empAddress = a;
        basic = b;
    }

    public void calculatesalary() {
        da = 0.5 * basic;
        hra = 0.5 * (basic + da);
        salary = basic + da + hra;
    }

    public double getsalary() {
        return salary;
    }
}

class Inheritance {
    public static void main(String args[]) {
        permanentEmployee pe1 = new permanentEmployee(1, "Mahesh", "Juhu", 10000);
        pe1.calculatesalary();
        System.out.println("Detailes Of permanent Employee.");
        pe1.displayEmpInfo();
        System.out.println("Salary: " + pe1.getsalary());
    }
}
