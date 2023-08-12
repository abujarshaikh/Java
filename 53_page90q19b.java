import java.io.*;

class X18 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Positive Integer");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }

        int number = Integer.parseInt(s);
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of a number " + number + " is : " + factorial);
    }
}