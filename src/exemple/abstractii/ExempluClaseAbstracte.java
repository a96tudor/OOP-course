package exemple.abstractii;

public class ExempluClaseAbstracte {

    public static void main(String[] args) {
        Elev elev = new Elev("Gigel", 10);
        Profesor profesor = new Profesor("Gigel", 2000);

        elev.incepeVacanta();
        //profesor.incepeVacanta();
    }

}
