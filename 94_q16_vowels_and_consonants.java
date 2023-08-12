
/*Write a ‘Java’ program to accept any character from user and print it is Vowel or
Consonant.
Output:
Enter an alphabet: G
G is a consonant.
Enter an alphabet: A
A is a vowel*/
import java.io.*;

class ConVow {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Character");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        char alphabet = s.charAt(0);
        if ((alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u')
                || (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U')) {
            System.out.print(alphabet + " is a vowel");
        } else {
            System.out.print(alphabet + " is a consonant");
        }
    }
}