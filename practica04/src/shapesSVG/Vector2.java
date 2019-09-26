/**
* Clase que simula el comportamiento de un Vector
* */
package shapesSVG;
import java.lang.Math;
 public class Vector2 {
        /** 
     * Parámetros de la clase Vector2
     * @param y Es el punto y que se utilizará en el vector
     * @param x Es el punto x que se utilizará en el vector
     * @param magnitud Es la magnitud del vector
     * */
    private  double x;
    private  double y;
    private double magnitud ;
    
    /**
     * Constructor común, que pide como parámetros los valores para las coordenadas x, y
     * @param x - Coordenada en el x
     * @param y - Coordenada en el y
    */
    public  Vector2( double  x , double  y ) {
        this. x = x;
        this. y = y;
    }
    /**
     * Constructor vació que no recibe parámetros y coloca el vector en (0, 0)
     */
    public  Vector2 () {
        this. x =  0.0 ;
        this. y =  0.0 ;
    }
     /**
      * Creación de setters
      */
    public  void  setX ( double  x ) {
        this. x = x;
    }
    public void setY ( double  y ) {
        this. y = y;
    }
    public  void  setMagnitud ( double  magnitud ) {
        this. magnitud = magnitud;
    }
    /**
     * Creación de getters
     */
    public  double  getX () {
        return   this.x;
    }
    public  double  getY () {
        return   this.y;
    }
    public  double  getMagnitud () {
        return   this.magnitud;
    }
    /**
     * Metodo que calcula la magnitud del vector, es decir, la distancia del Vector el punto (0, 0)
     * @return double - La magnitud del vector
     */
    public  double  Magnitud () {
        double newX = ( this. x - 0.0 );
        double newY = ( this. y - 0.0 );
        this.magnitud =  Math. sqrt ((newX * newX) + (newY * newY));
        return this.magnitud;
    }
    /**
     * Metodo que calcula la distancia de un vector a otro vector
     * @param v - Otro vector respecto al cual se calcula su distancia a nuestro vector inical
     * @return double - La distancia de nuestro Vector inical al Vector v
     */
     public double distancia ( Vector2  v ) {
        double newX = ( this . x - v . x);
        double newY = ( this . y - v . y);
        double distancia =  Math. sqrt ((newX * newX) + (newY * newY));
        return  distancia;
    
    }
    public Vector2 puntoMedio(Vector2 v){
        double newX = (this.x+v.x);
        double newY = (this.y+v.y);
        return new Vector2(newX, newY);
    }
    public double longitud(Vector2 a, Vector2 b ){
        double suma = Math.pow(b.getX() - a.getX(),2) + Math.pow(b.getY() - a.getY(),2);
        return Math.sqrt(suma);
    }
    /**
     * Metodo que permite que nuestro vector sea libremente gráficamente, regresa una cadena que representa la representación del Vector en SVG
     * @return String - La representación del vector en SVG
     */
    public  String  toSVG () {
        String vec = "<circle cx='"+Double.toString(this.x)+"' cy='"+Double.toString(this.y)+"' r='"+"5.0"+"' fill='"+"blue"+"' stroke='"+"red"+"' stroke-width='"+"1.0"+"'/>";
        return vec;
    }

    /**
     * Metodo para convertir un vector a una cadena de caracteres
     * @return String - Un vector en forma de cadena
     */
    @Override
    public  String  toString () {
        String vec =  " ( "  +  Double.toString (x) +  " , "  +  Double.toString (y) +  " ) " ;
        return  vec;
    }
    /**
     * Metodo que compara si 2 vectores son iguales, si son asi regresa verdadero, en otro caso falso
     * @param v - Vector con el cual se va a comparar
     * @return boolean - verdadero si 2 vectores son iguales, falso si no
     */
    public  boolean  equals ( Object  v ) {
    Vector2 z = ( Vector2 ) v;
    return x == z . getX () && y == z . getY ();
}

    
    
}
