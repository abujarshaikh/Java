import java.io.*;

class X17 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Positive Integer ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int number = Integer.parseInt(s);
        int factorial = 1;
        while (number > 1) {
            factorial *= number--;
        }
        System.out.println("The Factorial of a Number " + number + " is : " + factorial);
    }
}