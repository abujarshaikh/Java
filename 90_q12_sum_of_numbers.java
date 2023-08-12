/*Write a Java program to find the sum of first 50 natural numbers.
Output:Sum = 1275*/
class sum {
    public static void main(String[] args) {
        int sum = 0;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("Sum = " + sum);
        }
    }
}