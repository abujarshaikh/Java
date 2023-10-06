The Employee.java@
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