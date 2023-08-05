import java.io.*;

class X22 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any Positive Integer.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int number = Integer.parseInt(s);
        int a = 0, b = 1;
        System.out.println("The Fabbonacci Numbers are upto " + number);
        do {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        } while (b < number);
    }
}