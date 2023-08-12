/*
 * Rahul’s basic salary is input through the keyboard. His dearness allowance
 * is 50% of basic salary and house rent allowance is 30% of basic salary. Write
 * a Java program to calculate his total salary.
 */

import java.io.*;

class salary {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter The Basic Salary of Rahul: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double basic = Double.parseDouble(s);

        double da = 0.5 * basic;
        double hra = 0.3 * basic;
        double salary = (da + hra) + basic;
        System.out.println("Salary of Rahul is: " + salary);

    }
}
