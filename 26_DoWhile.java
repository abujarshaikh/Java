import java.io.*;

class DoWhile {
    public static void main(String[] args) {
        int countryNum = 0;
        do {
            System.out.println("\n\nList of SAARC Countries and Corresponding Codes.");
            System.out.println("Enter a Corresponding code for selecting a SAARC Country.");
            System.out.println("1: India.");
            System.out.println("2: Pakistan.");
            System.out.println("3: Sri Lanka.");
            System.out.println("4: Bangladesh.");
            System.out.println("5: Bhutan.");
            System.out.println("6: Nepal.");
            System.out.println("7: Maldives.");
            System.out.println("8: Afghanistan.");
            System.out.println("Enter 0 for Exiting the Program.");
            String s = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                s = br.readLine();
            } catch (Exception e) {

            }
            countryNum = Integer.parseInt(s);
            switch (countryNum) {
                case 0:
                    System.out.println("Exiting Program...!");
                    break;
                case 1:
                    System.out.println("Country : " + "India.");
                    System.out.println("Capital : " + "Delhi.");
                    System.out.println("Currency : " + "Rupee.");
                    break;
                case 2:
                    System.out.println("Country : " + "Pakistan.");
                    System.out.println("Capital : " + "Islamabad.");
                    System.out.println("Currency : " + "Rupee.");
                    break;
                case 3:
                    System.out.println("Country : " + "Sri Lanka.");
                    System.out.println("Capital : " + "Colombo.");
                    System.out.println("Currency : " + "Rupee.");
                    break;
                case 4:
                    System.out.println("Country : " + "Bangladesh.");
                    System.out.println("Capital : " + "Dhaka.");
                    System.out.println("Currency : " + "taka.");
                    break;
                case 5:
                    System.out.println("Country : " + "Bhutan.");
                    System.out.println("Capital : " + "Timpu.");
                    System.out.println("Currency : " + "Ngultrum.");
                    break;
                case 6:
                    System.out.println("Country : " + "Nepal.");
                    System.out.println("Capital : " + "Kathmandu.");
                    System.out.println("Currency : " + "Rupee.");
                    break;
                case 7:
                    System.out.println("Country : " + "Maldives.");
                    System.out.println("Capital : " + "Male.");
                    System.out.println("Currency : " + "Rufiyaa.");
                    break;
                case 8:
                    System.out.println("Country : " + "Afghanistan.");
                    System.out.println("Capital : " + "Kabul.");
                    System.out.println("Currency : " + "Afgani.");
                    break;
                default:
                    System.out.println("Entered Number is Doesn't belong any Country Code.\nEnter the Correct Input.");
            }
        } while (countryNum != 0);
    }
}