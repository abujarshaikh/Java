// package PDF;
import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length Of rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter The Breadth of Rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.print("The Area of rectangle is: " + area);
        sc.close();
    }
}
