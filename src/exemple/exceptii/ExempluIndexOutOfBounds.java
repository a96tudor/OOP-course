package exemple.exceptii;

public class ExempluIndexOutOfBounds {

    public static void main(String[] args) {
        int[] v = new int[10];
        try {
            System.out.println(v[11]);
        } catch (IndexOutOfBoundsException exp) {
            System.out.println("am prins exceptia!");
        }


    }

}
