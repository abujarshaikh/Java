import java.io.*;

class IfElseIfLadder {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the percentage of a Student");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        double percentage = Double.parseDouble(s);
        if (percentage >= 70 & percentage < 100) {
            System.out.println("The Student Has Secured Distinction.");
        } else if (percentage >= 60 & percentage < 70) {
            System.out.println("The student has Secured First Class.");
        } else if (percentage >= 45 & percentage < 60) {
            System.out.println("The Student Has Secured Second Class.");
        } else if (percentage >= 35 & percentage < 45) {
            System.out.println("The Student Has Secured Pass Class.");
        } else if (percentage >= 0 & percentage < 35) {
            System.out.println("The Student Has Failed.");
        } else if (percentage < 0 & percentage > 100) {
            System.out.println("Invalid Input");
        }
    }
}
