import java.io.*;

class X10 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The Score Of A Batsman.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int score = Integer.parseInt(s);
        if (score > 0) {
            if (score > 50) {
                if (score > 100) {
                    System.out.println("The Batsman Has Hit Century.");
                } else {
                    System.out.println("The Batsman Has Hit Half-Century.");
                }
            } else {
                System.out.println("The Batsman Has Not Hit Half-Century.");
            }
        } else {
            System.out.println("The Batsman Has Score Duck.");
        }
    }
}