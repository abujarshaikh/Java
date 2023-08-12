
// Write a program to print sum of n natural numbers
import java.util.*;

class X33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
            // System.out.println(sum);
        }
        System.out.println("Sum: " + sum);
    }
}