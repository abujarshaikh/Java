
// Program for ArrayList and methods interface.
import java.util.ArrayList;

/**
 * ArrayList1
 */
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        System.out.println("The Size of an Array List Is:: " + a.size());
        a.add("First");
        a.add("Second");
        a.add("Third");
        a.add("Fourth");
        a.add("Fifth");
        a.add(2, "Middle");
        System.out.println("The Size of an ArrayList After the Insertion of an Elements:: " + a.size());
        System.out.println(a);
        a.remove("Third");
        a.remove(1);
        System.out.println("The Size of An Array After Deletion operation::" + a.size());
        System.out.println(a);

    }
}