
// Write a Java Program to read amount in rupees. If amount is >=300 print idly, vada, dosa and puri followed by glass of water. printing of glass of water is mandatory.
import java.util.*;

class X28 {
    public static void main(String[] args) {
        System.out.println("Enter Amount in Rupees: ");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        if (amt >= 300) {
            System.out.println("idly, vada, dosa and puri followed by glass of water.");
        }
    }
}