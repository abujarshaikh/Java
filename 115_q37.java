// Write a ‘Java’ program to print all ODD numbers between 1-25 and also print count.
class X37 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 25; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total Odd Numbers Are: " + count);
    }
}