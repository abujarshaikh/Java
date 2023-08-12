
/*
 * Write a Java Program to calculate Simple Interest.
 * Output:
 * Enter the values of principal_amt:12
 * Enter the values of rate:10
 * Enter the values of time:5
 * Amount = Rs. 12.00
 * Rate = Rs. 10.00%
 */
import java.io.*;

class simpleinterest {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the values of Principle_amt :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        Double p = Double.parseDouble(s);
        System.out.print("Enter the values of Rate :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double r = Double.parseDouble(s);
        System.out.print("Enter the values of Time :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double t = Double.parseDouble(s);
        double SI = ((p * r * t) / 100);
        System.out.print("Simple Intrest is: " + SI);

    }
}