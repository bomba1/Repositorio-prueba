public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(2,0);
        Punto p2 = new Punto(3,3);

        double distancia = p1.distancia(p2);
        double distancia2 = p1.distancia(3,3);

        System.out.println("La distancia 1 es " + distancia);
        System.out.println("La distancia 2 es " + distancia2);


    }
}