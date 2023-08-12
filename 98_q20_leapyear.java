import java.io.*;

class leap {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a year:");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int year = Integer.parseInt(s);
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is Not a Leap Year");
        }

    }
}
