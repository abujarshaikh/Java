class BreakWhile {
    public static void main(String args[]) {
        int i = 1;
        while (i <= 20) {
            System.out.println(i * i);
            if (i == 9)
                break;
            i++;
        }
        System.out.println("Outside the while loop.");
    }
}