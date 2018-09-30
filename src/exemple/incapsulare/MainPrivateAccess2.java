package exemple.incapsulare;

import exemple.clase.Vector2D;

public class MainPrivateAccess2 {
    public static void main(String[] args) {
        exemple.clase.Vector2D v = new Vector2D(1.0, 2.0);

        System.out.println(v.x);
        System.out.println(v.y);
    }
}
