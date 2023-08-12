class BreakFor {
    public static void main(String arg[]) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i * i);
            if (i == 10)
                break;

        }
        System.out.println("Outside the for loop.");
    }
}
