/**
 * Clase que representa un punto
 */
public class Punto {

    /**
     * Atributo que representa el punto en x
     */
    private int x;

    /**
     * Atributo que representa la y
     */
    private int y;

    private Compra[] c;

    /**
     * Constructor vacio
     */
    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor de la clase
     * @param x
     * @param y
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo que devuelve el valor de x
     * @return
     */
    public int getX() {
        return this.x;
    }

    /**
     * Metodo que devuelve el valor de y
     * @return
     */
    public int getY() {
        return this.y;
    }

    /**
     * Metodo que calcula la distancia entre 2 puntos
     * @param punto
     * @return
     */
    public double distancia(Punto punto) {

        //Se obtiene la diferencia entre los x
        int dx = this.x - punto.getX();

        //Se obtiene la diferencia entre los y
        int dy = this.y - punto.getY();

        //Raiz cuadrada de x^2 + y^2
        return Math.sqrt(dx*dx + dy*dy);

    }

    /**
     * Metodo que calcula la distancia entre una clase punto
     * y un punto cualquiera
     * @param x
     * @param y
     * @return
     */
    public double distancia(int x, int y){
        Punto p = new Punto(x,y);
        return this.distancia(p);
    }

}
