import java.io.*;

class NestedSwitch {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose a Country by Entering a Number.");
        System.out.println("1: India.");
        System.out.println("2: Austrolia.");
        try {
            s = br.readLine();
        } catch (Exception e) {
            // TODO: handle exception
        }
        int country = Integer.parseInt(s);
        System.out.println("Choose a Sport by Entering a Number.");
        System.out.println("1: Cricket.");
        System.out.println("2: Tenis.");
        try {
            s = br.readLine();
        } catch (Exception e) {

        }
        int sport = Integer.parseInt(s);
        switch (country) {
            case 1:
                switch (sport) {
                    case 1:
                        System.out.println("Sachin Tendulkar is a God of Indian cricket team");
                        break;
                    case 2:
                        System.out.println("Major Dhyanchand is a God Of Indian Tenis Team");
                        break;
                    default:
                        System.out.println("Invalid Sport !!");

                }
                break;
            case 2:
                switch (sport) {
                    case 1:
                        System.out.println("Sir Donal Bradman is a God of Austrolia cricket team");
                        break;
                    case 2:
                        System.out.println("John McEnroe is a God of Austrolia Tenis team");
                        break;
                    default:
                        System.out.println("Invalid Sport !!");
                }
                break;
            default:
                System.out.println("Invalid Country !!");
        }
    }
}