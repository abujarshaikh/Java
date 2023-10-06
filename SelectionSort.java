// package Chapter8Package;

class SelectionSort {
    public static void printa(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int a[] = { 7, 8, 3, 1, 2 };
        // selction sort
        for (int i = 0; i < a.length - 1; i++) {
            int min_ele = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_ele]) {
                    min_ele = j;
                }
            }
            int temp = a[min_ele];
            a[min_ele] = a[i];
            a[i] = temp;
        }
        System.out.println();
        System.out.println("Sorted Array");
        printa(a);
        // System.out.println(a+ " ");
    }
}