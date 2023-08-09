class Employee {
    int empId;
    String empName;
    String empAddress;

    public Employee(int i, String n, String a) {
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

    public permanentEmployee(int i, String n, String a, double b) {
        super(i, n, a);
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

class Superclassconstructor {
    public static void main(String args[]) {
        permanentEmployee pe1 = new permanentEmployee(1, "Mahesh", "Juhu", 10000);
        pe1.calculatesalary();
        System.out.println("Permanent Employee Details");
        pe1.displayEmpInfo();
        System.out.println("Salary: " + pe1.getsalary());
    }
}