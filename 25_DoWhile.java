class DoWhile {
    public static void main(String args[]) {
        int i = 1;
        int sum = 0;
        int count = 0;
        double avg = 0;
        System.out.println("Numbers Are From 1 To 10");
        do {
            System.out.print(" " + i);
            sum = sum + i;
            i++;
            count++;
        } while (i <= 10);
        avg = (double) sum / count;
        System.out.println("\nSum of the number 1 to 10: " + sum);
        System.out.println("Average Of the Sum of the Number from 1 to 10: " + avg);
    }
}