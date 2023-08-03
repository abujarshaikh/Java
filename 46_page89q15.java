import java.io.*;

class X10 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Character\n"
                + "1).v Or V\n2).i Or I\n3).b Or B\n4).g Or G\n5).y Or Y\n6).o Or O\n7).r Or R ");
        try {
            s = br.readLine();
        } catch (Exception e) {
        }
        char ch = s.charAt(0);
        
        switch (ch) {
            case 'v':
            case 'V':
                System.out.println("Colour of Rainbow is:Violet");
                break;
            case 'i':
            case 'I':
                System.out.println("Colour of Rainbow is:Indigo");
                break;
            case 'b':
            case 'B':
                System.out.println("Colour of Rainbow is:Blue");
                break;
            case 'g':
            case 'G':
                System.out.println("Colour of Rainbow is:Green");
                break;
            case 'y':
            case 'Y':
                System.out.println("Colour of Rainbow is:Yellow");
                break;
            case 'o':
            case 'O':
                System.out.println("Colour of Rainbow is:Orange");
                break;
            case 'r':
            case 'R':
                System.out.println("Colour of Rainbow is:Red");
                break;
            default:
                System.out.println("Invalid Character");
                break;
        }
    }
}