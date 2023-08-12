
// Write a Java program to find the square of a number only if its LSB is 5.
import java.util.*;

class LSB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 10 != 0) {
            int square = n * n;
            System.out.print("Square = " + square + "\n");

        } else {
            System.out.println("Please Enter Valid Input!!");
        }
    }
}