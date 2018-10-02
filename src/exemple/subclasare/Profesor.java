package exemple.subclasare;

public class Profesor extends Persoana{

    public int salariu;

    public Profesor(String nume, int salariu) {
        super(nume);

        this.salariu = salariu;
    }

}
