package packageDemo;
class PackDemo{
    public static void main(String[] args){
        company c=new company("Sun Microsystem","Normandy" );
        Employee e=new Employee(1,"James Gosling","U.S.A");
        c.dispCompleteInfo(e);
    }
}
packag company;
// class  empPack;

class company {
    String compName;
    String compAddress;
    Employee e;

    public company(String c, String a) {
        compName = c;
        compAddress = a;
    }

    public void dispCompleteInfo(Employee temp) {
        e = temp;
        e.dispEmpInfo();
        System.out.println("Company Detailes");
        System.out.println("Company Name: " + compName);
        System.out.println("Company Address: " + compAddress);
    }
}
package Employee;
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
        System.out.println("Employee Detailes");
        System.out.println("Identification Number: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Address: " + empAddress);
    }
}