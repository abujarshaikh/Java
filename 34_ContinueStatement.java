class ContinueFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0)
                continue;
            {

            }
            System.out.println("The Number is Divisible By 5: " + i);
        }
    }
}

class ContinueWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            if (i % 5 != 0)

            {
                i++;
                continue;
            }
            System.out.println("The Number is Divisible By 5: " + i);
            i++;
        }
    }
}

class ContinueDoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 != 0)

            {
                i++;
                continue;
            }
            System.out.println("The Number is Divisible By 5: " + i);
            i++;
        } while (i <= 50);
    }
}
