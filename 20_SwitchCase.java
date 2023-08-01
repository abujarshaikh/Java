import java.io.*;

class SwitchCase {
    public static void main(String args[]) {
        {
            String s = null;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter An Hour Of Day ");
            try {
                s = br.readLine();
            } catch (Exception e) {
            }
            int hour = Integer.parseInt(s);
            switch (hour) {
                case 5:
                case 6:
                    System.out.println("Period of Day: Dawn.");
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    System.out.println("Period of Day: Morning.");
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                    System.out.println("Period of Day: Noon.");
                    break;
                case 16:
                case 17:
                case 18:
                    System.out.println("Period of Day:Evening.");
                    break;
                case 19:
                case 20:
                    System.out.println("Period of Day: Dusk.");
                    break;
                case 21:
                case 22:
                case 23:
                case 24:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Period of Day: Night");
                    break;
                default:
                    System.out.println("Invalid Input !! Please Enter Between 1 to 24.");
            }

        }
    }
}