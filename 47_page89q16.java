
import java.io.*;

class X12 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Number");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int number = Integer.parseInt(s);
        int absolutevalue = (number >= 0) ? number : -number;
        System.out.println("The Absolute Value Of a number " + number + " is : " + absolutevalue);
    }
}