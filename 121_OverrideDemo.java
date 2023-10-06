class overrideDemo {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Mahesh", "Juhu");
        e.displayEmpInfo();
        System.out.println();
        permanentEmployee pe = new permanentEmployee(2, "Dinesh", "Palghar", 8000);
        pe.calculatesalary();
        pe.displayEmpInfo();

    }
}

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
        System.out.println("Inside Super Class(Employee) displayEmpInfo() method ");
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
        hra = 0.5 * (da + basic);
        salary = basic + da + hra;
    }

    public void displayEmpInfo() {
        System.out.println("Inside Sub Class(Employee) displayEmpInfo() method ");
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
        System.out.println("Basic: Rs." + basic);
        System.out.println("Dearness Allowness: Rs." + da);
        System.out.println("House Rent Alloweness: Rs." + hra);
        System.out.println("Total Salary: Rs." + salary);
    }
}
