import java.io.*;

public class ExampleBufferReader {
    public static void main(String[] args) {
        String name = " ";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter data::");
        try {
            name = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.print("Entered Data is ::" + name);
    }
}
