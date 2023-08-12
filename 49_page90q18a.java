import java.io.*;

class X14 {
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
        int i = 2;
        while (i <= number) {
            boolean isPrime = true;
            int j = 2;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
}