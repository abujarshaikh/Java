class BreakNestedFor {
    public static void main(String arg[]) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int k = i * j;
                System.out.print(k + " ");
                if (j == 5)
                    break;

            }
            System.out.println();
        }

    }
}
