package exemple.incapsulare;

public class Vector2D {

    private double x;
    private double y;

    /** CONSTRUCTOR
     */
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double modul() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    /*
        GETTER

        Metodele denumite `get...` sunt in general cunoscute sub numele de "getter" si pot fi folosite pentru
        a extrage valorile campurilor private din clase.
     */
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    /*
        SETTER

        Metodele denumite `set...` sunt in general cunoscute sub numele de "setter" si pot fi folosite pentru a seta
        valorile campurilor private din clase.

        Un alt avantaj major ar acestora este ca cel care defineste clasa poate introduce niste verificari suplimentare
        asupra validitatii datelor de intrare. De exemplu, sa spunem ca acceptam doar valori nenule pozitive pentru x.
        In acest caz, functia setX ar arata asa:

        public void setX(double newX) {
            if (newX != 0) {
                this.x = newX;
            }
        }

        Astfel, ne asiguram ca orice s-ar intampla, valorile campurilor clasei raman valide.

     */
    public void setX(double newX) {
        this.x = newX;
    }

    public void setY(double newY) {
        this.y = newY;
    }

    public void add(Vector2D altVector) {
        this.x += altVector.x;
        this.y += altVector.y;
    }
}
