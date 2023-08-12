import java.io.*;

class X9 {
    public static void main(String arg[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an Hour.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int hour = Integer.parseInt(s);
        if (hour >= 0 & hour < 12) {
            System.out.println("Good Morning.");
        } else if (hour >= 12 & hour < 18) {
            System.out.println("Good Afternoon.");
        } else if (hour >= 18 & hour < 24) {
            System.out.println("Good Evening.");
        } else {
            System.out.println("Time is out of range");
        }
    }
}