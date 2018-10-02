package exemple.incapsulare;

import exemple.clase.Vector2D;

public class MainPrivateAccess2 {
    public static void main(String[] args) {
        Vector2D v = new Vector2D(1.0, 2.0);

        //v.x = 0.0;
        //v.y = 0.0;

        System.out.println(v.modul());
    }
}
