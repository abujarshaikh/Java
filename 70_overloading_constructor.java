class overloadingconstructor {
    int a;
    double b;
    String c;
    String d;

    A() {
        a = 10;
        b = 45.29;
        c = "Abujar";
        // return a;
    }

    void A(int x) {
        a = x;
        // return a;
    }

    void A(double y, String z) {
        b = y;
        c = z;
        // return b;
    }
}

class B {
    public static void main(String[] args) {
        A r = new A();

    }
}