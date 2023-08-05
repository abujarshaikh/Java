import java.io.*;

class X23 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Positive Integer.");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int number = Integer.parseInt(s);
        int a = 0, b = 1;
        while (a < number) {
            int c = a + b;
            a = b;
            b = c;

        }
        if (a == number) {
            System.out.print("The Number " + number + " is a Fabbonacci Number.");
        } else {
            System.out.print("The Number " + number + " is not a Fabbonacci Number.");
        }
    }
}