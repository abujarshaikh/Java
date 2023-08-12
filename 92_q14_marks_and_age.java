
/*Write a ‘Java’ program to accept age and percentage from user and print Qualified if his
age<=25 and per >=75 otherwise not qualified.
Output:
Enter the age : 22
Enter the per : 78
The person is Qualified
Enter the age : 26
Enter the per : 56
The person is Not Qualified*/
import java.io.*;

class MarksandAge {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Age: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int age = Integer.parseInt(s);
        System.out.print("Enter the Marks: ");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int marks = Integer.parseInt(s);
        if (age <= 25 & marks >= 75) {
            System.out.println("The person is Qualified.");
        } else {
            System.out.println("The person is Not Qualified.");
        }

    }
}