import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of Right Angle Triangle :");
        double height = sc.nextInt();
        System.out.println("The Width of Right Angle Triangle : ");
        double Width = sc.nextInt();
        double area = 0.5 * (height * Width);
        System.out.println("The Area of Right-Angled Triangle is: " + area);
    }
}
