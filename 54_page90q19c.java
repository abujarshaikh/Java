import java.io.*;

class X19 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any Positive integer");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int number = Integer.parseInt(s);
        int factorial = 1;
        do {
            factorial *= number--;
        } while (number > 1);
        System.out.println("The factorial of a number " + number + " is : " + factorial);
    }
}