class WhileLoop {
    public static void main(String args[]) {
        int i = 1;
        int sum = 0;
        double avg = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        avg = (double) sum / 10;
        System.out.println("The Sum of Numbers  1 to 10 is: " + sum);
        System.out.println("The Avarage of Sum of Number 1 to 10 is: " + avg);
    }
}