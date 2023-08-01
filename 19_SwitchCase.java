import java.io.*;

class SwitchCase {
    public static void main(String args[]) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Number Between 1 to 7.");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        int i = Integer.parseInt(s);
        switch (i) {
            case 1:
                System.out.println("Day is Sunday.");
                System.out.println("Sunday is Holiday.");
                break;
            case 2:
                System.out.println("Day is Monday.");
                System.out.println("Subject: Web Devlopment.");
                break;
            case 3:
                System.out.println("Day is Tuesday.");
                System.out.println("Subject: OOP JAVA.");
                break;
            case 4:
                System.out.println("Day is Wednesday.");
                System.out.println("Subject: Compiler Construction.");
                break;
            case 5:
                System.out.println("Day is Thursday.");
                System.out.println("Subject: Data Analytics.");
                break;
            case 6:
                System.out.println("Day is Friday.");
                System.out.println("Subject: Blockchain Tech.");
                break;
            case 7:
                System.out.println("Day is Saturday.");
                System.out.println("Subject: Software Testing.");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }

}
