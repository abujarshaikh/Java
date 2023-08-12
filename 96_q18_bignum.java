
/*Write a ‘Java’ program to print biggest of three numbers.*/
import java.io.*;

class bignum {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num1 = Integer.parseInt(s);
        System.out.println("Enter 2nd number");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num2 = Integer.parseInt(s);
        System.out.println("Enter 3rd number");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num3 = Integer.parseInt(s);
        if ((num1 > num2 && num1 > num3)) {
            System.out.print("\nBiggest Number is " + num1 + "\n");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("\nBiggest Number is " + num2 + "\n");

        }
        if (num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("All are Equals.");
        } else {
            System.out.println("\nBiggest Number is " + num3 + "\n");

        }

    }
}