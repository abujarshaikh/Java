
// Write a ‘Java’ Program to read any integer number and check whether it is prime or not prime
import java.util.*;

class X35 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number");
      int n = sc.nextInt();
      boolean isPrime = true;
      for (int i = 2; i == n / 2; i++) {
         if ((n % i) == 0) {
            isPrime = false;
            System.out.println("The number is Not a prime Number");
         } else {
            isPrime = true;
            System.out.println("The number is prime Number");
         }
      }
   }
}