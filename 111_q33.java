
// // Write a program to enter the numbers till the user wants and at the end it should display the count of positive and negative entered.
import java.util.*;

class X33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivenum = 0;
        int negativenum = 0;
        System.out.println("Enter 0 to terminate: ");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            } else if (num > 0) {
                positivenum++;
            } else {
                negativenum++;
            }
        }
        System.out.println("The Positive Numbers are: " + positivenum);
        System.out.println("The Negative numbers are : " + negativenum);
    }
}
