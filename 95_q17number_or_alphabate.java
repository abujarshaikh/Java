/*Write a ‘Java’ program to accept any Key from user and print it is alphabet or number.
Output:
Enter a character: a
a is an alphabet
Enter a character: 7
7 is a number*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Char {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                System.out.print("Enter Any Key: ");
                char inputCharacter = br.readLine().charAt(0);
                if (Character.isLetter(inputCharacter)) {
                    System.out.println(inputCharacter + " is an alphabet.");

                } else if (Character.isDigit(inputCharacter)) {
                    System.out.println(inputCharacter + " is a digit");
                } else {
                    System.out.println(inputCharacter + " is neither digit nor alphabate.");
                }
                System.out.print("Do you want to continue? (y/n): ");
                char choice = br.readLine().toLowerCase().charAt(0);
                if (choice != 'y') {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.print("An Error Occured In Program.");
        }
    }
}