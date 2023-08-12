
//  Program display first n terms of Fibonacci series
import java.util.*;

class X30 {
    public static void main(String[] args) {
        System.out.print("Enter Any Positive Integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0, b = 1;
        System.out.println("The Fabonacci Numbers upto " + num + " are:");
        System.out.println(a);
        do {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        } while (num > b);
    }
}