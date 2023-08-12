
// Write a ‘Java’ program to accept the number and print its mathematical table.
import java.util.*;

class X34 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number");
        int n = sc.nextInt();
        System.out.println("The Multiplication Table of" + n + " :");
        for (int i = 1; i <= 10; i++) {
            int mul = n * i;
            System.out.println(mul);
        }
    }
}