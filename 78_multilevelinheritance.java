class A {
    int a, b, c;

    void add() {
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of a and b is: " + c);
    }

    void sub() {
        a = 200;
        b = 100;
        c = a - b;
        System.out.println("Sub of a and b is: " + c);
    }
}

class B extends A {
    void multi() {
        a = 10;
        b = 20;
        c = a * b;
        System.out.println("Multiplication of a and b is: " + c);
    }

    void div() {
        a = 10;
        b = 2;
        c = a / b;
        System.out.println("Division of a and b is: " + c);
    }
}

class C extends B {
    void rem() {
        a = 10;
        b = 3;
        c = a % b;
        System.out.println("Reminder of a and b is: " + c);
    }
}

class Test {
    public static void main(String[] args) {
        C r = new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }

}