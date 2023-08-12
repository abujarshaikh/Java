class MethodReturnValue {
    public static void main(String args[]) {
        int x = 20;
        int y = even(x);
        // System.out.println();
        int p = 5;
        int q = even(p);

    }

    public static int even(int a) {
        if (a % 2 == 0) {
            System.out.println(+a + " is a Even Number");
        } else {
            System.out.println(+a + " is an Odd Number");
        }
        return a;
    }
}