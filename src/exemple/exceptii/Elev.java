package exemple.exceptii;

public class Elev extends Persoana {

    private int nota;

    public Elev(String nume, int nota) throws InvalidGradeException {
        super(nume);

        if (nota > 10 || nota < 1) {
            throw new InvalidGradeException();
        } else {
            this.nota = nota;
        }
    }

    public void setNota(int newNota) throws InvalidGradeException {
        if (newNota > 10 || newNota < 1) {
            throw new InvalidGradeException();
        } else {
            this.nota = newNota;
        }
    }

    public int getNota() {
        return this.nota;
    }

}
