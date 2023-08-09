
/*Write a Java program to find the volume and surface area of cone
Output:
Enter value of radius of a cone : 6
Enter height of a cone :9
Surface area of cone is: 302.700
Volume of cone is : 324.000*/
import java.io.*;

class cone {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter value of radius of a cone :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double r = Double.parseDouble(s);
        System.out.print("Enter value of height of a cone :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double h = Double.parseDouble(s);
        double sa = ((3.14159 * r * r) + (3.14 * h * r));
        double volume = ((3.14159 * r * r * h) / 3);
        System.out.print("Surface area of cone is: " + sa);
        System.out.print("Volume of cone is : " + volume);
    }
}
