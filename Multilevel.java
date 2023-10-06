public class Multilevel {
    public static void main(String[] args) {
        State st = new State("Asia", "India", "Maharashtra");
        System.out.println("\n");
        System.out.println("The Place is as Follow");
        System.out.println("\n");
        st.Display2();
    }
}

class Continel {
    String ContinelName;

    Continel(String ContinelName) {
        this.ContinelName = ContinelName;
    }

    void Display() {
        System.out.println("Name Of the Continel is " + ContinelName);
    }
}

class Country extends Continel {
    String CountryName;

    Country(String ContinelName, String CountryName) {
        super(ContinelName);
        this.CountryName = CountryName;
    }

    void Display1() {
        Display();
        System.out.println("Name of the Country is " + CountryName);
    }
}

class State extends Country {
    String StateName;

    State(String ContinelName, String CountryName, String StateName) {
        super(ContinelName, CountryName);
        this.StateName = StateName;
    }

    void Display2() {
        Display1();
        System.out.println("Name of the State is " + StateName);

    }
}
