
// Write a ‘Java’ program to accept a positive integer from user and print it in reverse order.
import java.util.*;

class revernum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int reversedNumber = 0;
        while (num > 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("The Reversed Number of " + num + "is:" + reversedNumber);
    }
}