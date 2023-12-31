
// Write a Java program that prints the numbers from 1 to 50. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
import java.util.*;

class X27 {
    public static void main(String[] args) {
        System.out.println("Numbers From 1 to 50.");
        for (int i = 1; i <= 50; ++i) {
            System.out.print("\n");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if ((i % 3 == 0)) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }
}