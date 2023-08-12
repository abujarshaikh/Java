
//area of rectangle 

import java.io.*;

class area_of_rectangle {
    public static void main(String[] args) {
        String s = null;
        // String s1 = null;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Area of Rectangle");
        System.out.print("Enter the length of Rectangle: ");
        try {
            s = input.readLine();

        } catch (Exception e) {
            // TODO: handle exception
        }
        double l = Double.parseDouble(s);
        System.out.print("Enter the breadth of Rectangle: ");
        try {
            s = input.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        double w = Double.parseDouble(s);
        int a = (int) (l * w);

        System.out.println("Area of Rectangle: " + a);

    }
}
