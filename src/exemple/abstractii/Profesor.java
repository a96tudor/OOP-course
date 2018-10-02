package exemple.abstractii;

public class Profesor extends Persoana {

    private int salariu;

    public Profesor(String nume, int salariu) {
        super(nume);

        this.salariu = salariu;
    }

    @Override
    public void incepeVacanta() {
        System.out.println("Meh! Tot munca.");
    }
}
