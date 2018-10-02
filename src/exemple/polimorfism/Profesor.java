package exemple.polimorfism;

public class Profesor extends Persoana {

    public int salariu;

    public Profesor(String nume, int salariu) {
        super(nume);

        this.salariu = salariu;
    }

    @Override
    public void cineSunt() {
        System.out.println("PROFESOR " + this.nume);
    }

}
