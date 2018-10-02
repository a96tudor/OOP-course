package exemple.incapsulare;

public class MainAdunare {

    public static void main(String[] args) {
        Vector2D vector1 = new Vector2D(1.0, 2.0);
        Vector2D vector2 = new Vector2D(2.0, 2.0);

        Vector2D resultatAdunare = vector1.aduna(vector2);

        System.out.println(resultatAdunare.modul());
    }

}
