//Compilr the program at the command prompt execute the program by typing the "java CLADemo India is my country"
class CLADemo {
    public static void main(String args[]) {
        if (args.length == 0)
            System.out.println("No Arguments have been supplied.");
        else {
            System.out.println("The arguments entered at the command propt are: ");
            for (int i = 0; i < args.length; i++) {
                System.out.print("\t" + args[i] + "  ");
            }
        }
    }
}