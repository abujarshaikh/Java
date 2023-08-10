
/*Write a ‘Java’ program to accept any number from user and print it is even or odd.
Output:
Enter an integer: 7
7 is odd.
*/
import java.io.*;

class evenodd {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter the Number:");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int num = Integer.parseInt(s);
        if ((num % 2) == 0) {
            System.out.print(+num + " is Even");
        } else {
            System.out.print(+num + " is Odd");

        }

    }
}