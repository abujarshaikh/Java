import java.util.*;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type Your Name::");
        String str = sc.nextLine();
        System.out.println("Users Name is::" + str);
        sc.close();
    }
}
