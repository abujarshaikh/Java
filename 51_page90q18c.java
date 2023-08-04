import java.io.*;

class X16 {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Integer");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int number = Integer.parseInt(s);
        do {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
            number++;
        } while (number <= number);
    }
}