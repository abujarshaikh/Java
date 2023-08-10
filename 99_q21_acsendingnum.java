import java.io.*;

class asce {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter A 1st Number: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num1 = Integer.parseInt(s);
        System.out.print("Enter A 2nd Number: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num2 = Integer.parseInt(s);
        System.out.print("Enter A 3st Number: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num3 = Integer.parseInt(s);
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);

            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);

            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println(num3 + " " + num1 + " " + num2);

            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
}