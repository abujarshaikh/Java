//Demonstrate the nesting of Do-While Loop
class DoWhileNest {
    public static void main(String arg[]) {
        int i = 1, j;
        do {
            j = 1;
            do {
                int k = i * j;
                System.out.print(k + " ");
                j++;
            } while (j <= 10);
            i++;
            System.out.println();
        } while (i <= 10);
    }
}