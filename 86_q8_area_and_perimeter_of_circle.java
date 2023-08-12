
/*
 * Java program tocalculate area and perimeter of circle.
 * Sample I/O
 * Enter the radius:
 * 15.50
 * Area of circle:754.7676350249478 pir*r
 * Perimeter of circle:97.38937226128358 2pir
 */
import java.io.*;

class circle {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the radius: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double r = Double.parseDouble(s);
        double area = (Math.PI) * r * r;
        double perimeter = 2 * (Math.PI) * r;
        System.out.println("Area of circle: " + area);
        System.out.println("Perimeter of circle: " + perimeter);
    }
}