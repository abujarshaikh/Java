// hierarchical_inheritance
class quadirilateral {
    double s1, s2, s3, s4;

    public quadirilateral(double side1, double side2, double side3, double side4) {
        s1 = side1;
        s2 = side2;
        s3 = side3;
        s4 = side4;
    }

    public double computeArea() {
        System.out.println("This method is for specific quadilateral.");
        return -999;
    }
}

class Square extends quadirilateral {
    public Square(double side1) {
        super(side1, side1, side1, side1);
    }

    public double computeArea() {
        return (s1 * s1);
    }
}

class rectangle extends quadirilateral {
    public rectangle(double side1, double side2) {
        super(side1, side2, side1, side2);
    }

    public double computeArea() {
        return (s1 * s2);
    }
}

class circle extends quadirilateral {
    double radius = s1;

    public circle(double side1) {
        super(side1, side1, side1, side1);
    }

    public double computeArea() {
        return (3.14 * s1 * s1);
    }
}

class hierarchical {
    public static void main(String args[]) {
        quadirilateral refvar;
        quadirilateral q = new quadirilateral(1, 2, 3, 4);
        Square s = new Square(10);
        rectangle r = new rectangle(10, 20);
        circle c = new circle(10);

        refvar = q;
        System.out.println("Area quadrilateral: " + refvar.computeArea());

        refvar = s;
        System.out.println("Area of Square: " + refvar.computeArea());

        refvar = r;
        System.out.println("Area of rectangle: " + refvar.computeArea());

        refvar = c;
        System.out.println("Area of Circle is: " + refvar.computeArea());
    }
}