class Employee {
    double empId;
    String empName;
    String empAddress;

    public void displayEmpInfo() {
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
    }
}

class permanentEmployee extends Employee {
    double basic, da, hra;
    double salary;

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
        Employee e1 = new Employee();
        e1.empId = 1;
        e1.empName = "Mahesh";
        e1.empAddress = "Juhu";
        System.out.println("Employee Details.");
        e1.displayEmpInfo();
        System.out.println();
        permanentEmployee pe1 = new permanentEmployee();
        pe1.empId = 2;
        pe1.empName = "Dinesh";
        pe1.empAddress = "Palghar";
        pe1.basic = 10000;

        pe1.calculatesalary();
        System.out.println("Permenant Employee Details.");
        pe1.displayEmpInfo();
        System.out.println("Salary: " + pe1.getsalary());

    }
}