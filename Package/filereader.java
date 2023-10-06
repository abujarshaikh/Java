import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFileExample {
    public static void main(String[] args) {
        // Provide the path to the file you want to read
        // String filePath = "C:\\Users\\abuja\\OneDrive\\Desktop";

        try {
            FileReader fileReader = new FileReader("C:\\Users\\abuja\\OneDrive\\Desktop");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
