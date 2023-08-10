
/*Write a ‘Java’ program to accept age from user and print Eligible for voting or not.
Output:
Enter the age : 20
The person is eligible to vote.
Enter the age : 16
The person is not eligible to vote.*/
import java.io.*;

class vote {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Age: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int age = Integer.parseInt(s);
        if (age > 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}