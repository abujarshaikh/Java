
// Java Program: read the age of 20 persons and count the number of persons in the age group 50 -60
import java.util.*; // import Scanner class from library

class AgeGroup {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total no.of people: ");
        int size = sc.nextInt();
        int age[] = new int[size];
        int count = 0;
        for (int i = 1; i < size; i++) {
            System.out.print("Enter The age of prson " + i + " :");
            age[i] = sc.nextInt();
            System.out.print(age[i]);
            if (age[i] >= 50 && age[i] <= 60) {
                count++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(age[i] + " ");

        }

        System.out.println("The Number of persons in the age between 50-60: " + count);
        sc.close();
    }
}