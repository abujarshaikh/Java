
// Write a ‘Java’ Program to Check Whether Given Number is Perfect or Not
// Prfect Number is a number  whoose sum of factores is equal to the that number.
//example 28 factors:- 1+2+4+7+14=28. 28 is a perfect number.
import java.util.*;

class perfectNumber {
    public static void main(String args[]) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println("Then Number " + n + " is a Perfect Number.");
        } else {
            System.out.println("The Number " + n + " is Not a Perfect Number.");
        }
    }
}