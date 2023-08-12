
// these one doesnt giving proper output if you can fix it so plz mail me the code on abujarshaikh24@gmail.com or wp me 7517225875
import java.io.*;

class Genfib {
    int genfibbonacci(int n) {
        int fib;
        if (n == 1)
            fib = 0;
        else if (n == 2)
            fib = 1;
        else
            fib = (genfibbonacci(n - 1) + genfibbonacci(n - 2));
        return fib;
    }
}

class Recursion {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Integer to generate fabbonacci Number.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        Integer Y = Integer.parseInt(s);
        int j = Y.intValue();
        Genfib g = new Genfib();
        int p = g.genfibbonacci(j);
        System.out.println("The Required Fabbonacci Term is " + p);

    }
}