
/*Write a Java program to calculate roots of Quadratic Equation for all the cases.
Output:
Enter coefficients a: 4
Enter coefficients b:5
Enter coefficients c:1
Roots are real and different.
x1 = -0.25
x2 = -1*/
import java.io.*;

class quadequrut {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter coefficients a: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double a = Double.parseDouble(s);
        System.out.println("Enter coefficients b: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double b = Double.parseDouble(s);
        System.out.println("Enter coefficients c: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double c = Double.parseDouble(s);
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("x1 = " + root1);
            System.out.println("x2 = " + root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("x1 = " + root);

        } else {
            double realpart = -b / 2 * a;
            double imaginarypart = (Math.sqrt(d) / 2 * a);
            System.out.println("Roots are complex.");
            System.out.println("x1 = " + realpart + " + " + imaginarypart + "i");
            System.out.println("x2 = " + realpart + " - " + imaginarypart + "i");
        }
    }
}