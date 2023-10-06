// package PDF;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle: ");
        int side = sc.nextInt();
        double area = ((Math.sqrt(3)) * side * side) / 4;
        System.out.println("Area of equilateral Triangle is: " + area);
    }
}
