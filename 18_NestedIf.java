import java.io.*;

class NestedIf {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Year");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int year = Integer.parseInt(s);
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("The year " + year + " is a leap year");
            } else {
                System.out.println("The year " + year + " is not a leap year");
            }
        } else if (year % 4 == 0) {
            System.out.println("The year " + year + " is a Leap year ");
        } else {
            System.out.println("The year " + year + " is Not A Leap Year ");
        }
    }

}