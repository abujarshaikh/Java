class Employee {
    double empId;
    String empName, empAddress;

    void setvalues(double id, String n, String addr) {
        empId = id;
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

    void detect(Employee e) {
        if (empId == e.getempId()) {
            System.out.println("The Employee Ids Are Same\n.");
        } else {
            System.out.println("The Employee IDs Are Not Same");
        }
        if (empName == e.getempName()) {
            System.out.println("The Employee Names Are Same\n.");
        } else {
            System.out.println("The Employee Names Are Not Same.");
        }
        if (empAddress == e.getempAddress()) {
            System.out.println("The Employee Addresses Are Same.\n");
        } else {
            System.out.println("The Employee Address Are Not Same.");
        }
    }
}

class EmployeeDemo {
    double d;
    String s;
    String a;

    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.setvalues(1, "Mahesh", "Juhu");
        Employee e2 = new Employee();
        e2.setvalues(2, "Dinesh", "Palghar");
        Employee e3 = new Employee();
        e3.setvalues(3, "Binod", "Haveli");
        System.out.println("Comparing values stored in objects e1 and e2.");
        e1.detect(e2);
        System.out.println();
        System.out.println("Comparing values stored in objects e1 and e3.");
        e1.detect(e3);
    }
}
