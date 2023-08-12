import java.io.*;

class posorneg {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any Integer: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num = Integer.parseInt(s);
        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {

            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + "is zero.");
        }
    }
}