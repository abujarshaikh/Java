 The company.java@
package empPack;
class company {
    String compName;
    String compAddress;
    Employee e;

    public company(String c, String a) {
        compName = c;
        compAddress = a;
    }

public void dispCompInfo(Employee temp){
    e=temp;
    e.displayEmpInfo;
    System.out.println("Company Ddetailes:");
    System.out.println("Company Name: "+compName);
    System.out.println("Company Address: "+compAddress);
}
} 
Employee.java@ class
package empPack;

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
        System.out.println("Employee Details:");
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
    }
}
PackageDemo.java class@
package empPack;

class PackageDemo {
    public static void main(String[] args) {
        company com = new company("Sun Microsystem", "Normandy");
        Employee emp = new Employee(1, "James Gosling", "USA");
        com.dispCompInfo(emp);

    }
}
