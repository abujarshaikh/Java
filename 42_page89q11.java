import java.io.*;

class X8 {
    public static void main(String args[]) {
        String s = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any Integer.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int i = Integer.parseInt(s);
        if (i % 5 == 0) {
            System.out.println("The Number " + i + " is Divisible by 5.");
        }
    }

}
