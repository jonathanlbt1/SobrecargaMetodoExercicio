public class Main {

    public static void main(String[] args) {

        System.out.println(Quadrilatero.area(3));
        System.out.println(Quadrilatero.area(5, 5));

        double losangulo = Quadrilatero.area(7, 8, 9);
        System.out.println("A área do trapézio é " + losangulo);
    }
}
