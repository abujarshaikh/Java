class EmptyWhile {
    public static void main(String[] args) {
        int i = 0;
        int a[] = { 100, 200, 300, 400, 500, 600, 700, 800, 900 };
        int j = a.length - 1;
        while (++i < -j) {
            System.out.println("The Median of the set of values is " + a[i]);
        }
    }
}