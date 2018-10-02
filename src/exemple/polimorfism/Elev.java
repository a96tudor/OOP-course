package exemple.polimorfism;

public class Elev extends Persoana {

    public int nota;

    public Elev(String nume, int nota) {
        super(nume);

        this.nota = nota;
    }


    @Override
    public void cineSunt() {
        System.out.println("ELEV " + this.nume);
    }

}
