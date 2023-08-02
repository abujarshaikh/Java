import java.io.*;

class Question {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Year");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int year = Integer.parseInt(s);
        boolean t = year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
        System.out.println("The year " + year + " is a leap year." + t);
    }

}