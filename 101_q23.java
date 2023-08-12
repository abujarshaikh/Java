
// Write a Java program to accept a coordinate point in a XY coordinate system and
// determine its quadrant.
import java.util.*;

class X25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Integer: ");
        int num2 = sc.nextInt();
        if (num1 > 0 && num2 > 0) {
            System.out.println(num1 + " and " + num2 + " are in First Quadrent.");
        } else if (num1 < 0 && num2 > 0) {
            System.out.println(num1 + " and " + num2 + " are in Second Quadrent.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println(num1 + " and " + num2 + " are in Third Quadrent.");
        } else if (num1 > 0 && num2 < 0) {
            System.out.println(num1 + " and " + num2 + " are in Fourth Quadrent.");
        }
    }
}
