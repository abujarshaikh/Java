class Addnumbers {
    int add(int a, int b) {
        return (a + b);
    }

    float add(float a, float b) {
        return (a + b);
    }

    int add(int a, int b, int c) {
        return (a + b + c);
    }

    double add(double a, double b, double c, double d) {
        return (a + b + c + d);
    }
}

class OverloadingDemo {
    public static void main(String args[]) {
        Addnumbers br = new Addnumbers();
        int x = br.add(10, 20);
        float y = br.add(20.5f, 45.5f);
        int z = br.add(10, 20, 30);
        double p = br.add(10, 20, 30, 40);
        System.out.println("With 2 Integer values Sum is: " + x);
        System.out.println("With 2 Float values Sum is: " + y);
        System.out.println("With 3 Integer values Sum is: " + z);
        System.out.println("With 4 Double values Sum is: " + p);

    }
}