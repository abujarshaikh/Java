import java.io.*;

class SimpleIf {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter any non-zero integer");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int i = Integer.parseInt(s);
        if (i > 0) {
            System.out.println("The Number " + i + " is a Positive number");
        }
        System.out.println("All Positive Numbers are greater than zero");
        System.out.println("All Positive Numbers are greater than zero");
    }
}
