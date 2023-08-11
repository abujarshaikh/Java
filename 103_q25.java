
import java.util.*;

class solution {
    public static void main(String args[]) {
        System.out.print("Enter Quantity: ");
        Scanner sc = new Scanner(System.in);
        int qun = sc.nextInt();
        System.out.print("Enter Rate: ");
        Scanner sc1 = new Scanner(System.in);
        int rate = sc1.nextInt();
        int totalExpense = qun * rate;

        if (qun > 1000) {
            double totalExpenses = totalExpense * 0.1;
            // double expenses = (double) ((qun * rate) * 0.1);
            // System.out.println("Total Expenses With 10% Discount : " + expenses);
        } else {

            System.out.println("Total Expenses : " + totalExpense);
        }

    }
}