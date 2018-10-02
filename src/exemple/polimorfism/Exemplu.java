package exemple.polimorfism;

public class Exemplu {

    public static void main(String[] args) {
        Persoana persoana = new Persoana("Gigel");
        Profesor profesor = new Profesor("Gigel", 2000);
        Elev elev = new Elev("Gigel", 10);

        persoana.cineSunt();
        profesor.cineSunt();
        elev.cineSunt();
    }

}
