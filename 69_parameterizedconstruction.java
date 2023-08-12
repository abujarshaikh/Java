class Employee {
    double empId;
    String empName;
    String empAddress;

    Employee(double d, String n, String addr) {
        empId = d;
        empName = n;
        empAddress = addr;
    }

    double getempId() {
        return empId;
    }

    String getempName() {
        return empName;
    }

    String getempAddress() {
        return empAddress;
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        double d;
        String s;
        String a;
        Employee e1 = new Employee(1, "Mahesh", "Juhu");
        Employee e2 = new Employee(2, "Dinesh", "Palghar");
        System.out.println("Employee e1's Details");
        d = e1.getempId();
        s = e1.getempName();
        a = e1.getempAddress();
        System.out.println("Identification Number." + d);
        System.out.println("Name." + s);
        System.out.println("Address." + a);
        System.out.println();
        System.out.println("Employee e2's Details");
        d = e2.getempId();
        s = e2.getempName();
        a = e2.getempAddress();
        System.out.println("Identification Number." + d);
        System.out.println("Name." + s);
        System.out.println("Address." + a);
        System.out.println();
    }
}