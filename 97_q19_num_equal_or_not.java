import java.io.*;

class check {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a 1st Number: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int n1 = Integer.parseInt(s);
        System.out.print("Enter a 2nd Number: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int n2 = Integer.parseInt(s);
        if (n1 > n2) {
            System.out.println("The 1st Number " + n1 + " is Greater than 2nd Number " + n2);
        } else if (n1 < n2) {
            System.out.println("The 2nd Number " + n2 + " is Greater than 1st Number " + n1);
        } else {
            System.out.println("The 1st Number " + n1 + " and 2nd Number " + n2 + " both are equal.");
        }
    }
}