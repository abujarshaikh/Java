import java.util.*;

class X26 {
    public static void main(String args[]) {
        System.out.println("The Basic salary of Employee is :");
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        System.out.println("Enter current year : ");
        Scanner sc1 = new Scanner(System.in);
        int cy = sc1.nextInt();
        System.out.println("Enter the Year of Joining: ");
        Scanner sc2 = new Scanner(System.in);
        int jy = sc2.nextInt();
        int ab = (cy - jy);
        int totalsalary;

        if (ab > 3) {
            totalsalary = (bs * 12) + 2500;
            System.out.println("Total Salary :" + totalsalary);
        } else {
        }

    }
}