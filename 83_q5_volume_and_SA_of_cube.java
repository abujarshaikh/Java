
/*Write a Java program to find the volume and surface area of a cube
Output:
Enter the length of a side :34
Surface area = 6936.00 and Volume = 39304.00*/
import java.io.*;

class cube {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the length of a side :");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double side = Double.parseDouble(s);
        double sa = (6 * side * side);
        double volume = (side * side * side);
        System.out.print("Surface Area = " + sa + " Volume = " + volume);
    }
}