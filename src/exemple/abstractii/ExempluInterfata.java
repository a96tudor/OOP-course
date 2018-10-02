package exemple.abstractii;

public class ExempluInterfata {

    public static void main(String[] args) {
        Caine caine = new Caine(5);
        Barza barza = new Barza(5);

        caine.merge();
        barza.merge();
    }

}
