import java.io.*;

class IfElse {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any Number");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int i = Integer.parseInt(s);
        if (i % 2 == 0) {
            System.out.println("The Number " + i + " is an even number");
        } else {
            System.out.println("The Number " + i + " is an odd number");
        }
    }
}
