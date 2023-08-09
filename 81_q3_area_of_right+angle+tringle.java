
/*Write a Java program to find the area of a right-angled triangle
Output:
Enter height of the given triangle:10
Enter width of the given triangle: 15
Area of right angled triangle is: 75.000*/
import java.io.*;

class area {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter height of the given triangle: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double height = Double.parseDouble(s);
        System.out.print("Enter width of the given triangle: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double breadth = Double.parseDouble(s);
        int area = (int) (0.5 * height * breadth);
        System.out.println("Area of right angled triangle is: " + area);
    }
}