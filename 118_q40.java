
// Write a ‘Java’ program to check number is Armstrong number or not.
import java.util.*;

class ArmstrongNumber {
    public static void main(String args[]) {
        int num, sum, temp;
        int i = 1;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ant Positive Integer: ");
        num = sc.nextInt();
        sum = 0;
        i = num;
        while (num > 0) {
            n = num % 10;
            num = num / 10;
            sum = sum + (n * n * n);
        }
        if ((i == sum)) {
            System.out.println("The Number " + i + " is a Armstrog Number: ");
        } else {
            System.out.println("The Number " + i + " isn't an Armstrog Number");
        }
    }
}