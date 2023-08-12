
/*Write a Java program to find the area of an equilateral triangle
Output:
Enter size of side of the equilateral triangle: 5
Area of equilateral triangle is: 10.825*/
import java.io.*;

class EquilateralTriangle {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of side of the equilateral triangle: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double side = Double.parseDouble(s);
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.print("Area of equilateral triangle is: " + area);
    }
}