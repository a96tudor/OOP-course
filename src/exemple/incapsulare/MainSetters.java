package exemple.incapsulare;

import exemple.incapsulare.Vector2D;

public class MainSetters {

    public static void main(String args[]) {
        Vector2D v = new Vector2D(1.0, 2.0);

        v.setX(0.0);
        v.setY(0.0);

        System.out.println(v.modul());
    }

}
