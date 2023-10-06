import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Basic Salary Of Rahul: ");
        int bs = sc.nextInt();
        double da = 0.5 * bs;
        double hra = 0.3 * bs;
        double Salary = da + hra + bs;
        System.out.println("The Dearness Alloweness of Rahul is: " + da);
        System.out.println("The House Rent Alloweness Of Rahul is: " + hra);
        System.out.print("The Total Salary Of Rahul is: " + Salary);
    }
}
