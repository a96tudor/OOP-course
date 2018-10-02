package exemple.abstractii;

public class Elev extends Persoana {

    public int nota;

    public Elev(String nume, int nota) {
        super(nume);

        this.nota = nota;
    }

    @Override
    public void incepeVacanta() {
        System.out.println("Yay! Timp liber!");
    }

}
