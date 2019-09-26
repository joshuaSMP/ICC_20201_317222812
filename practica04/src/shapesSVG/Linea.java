/**
 * Clase que modela una linea
**/
package shapesSVG;
 public class Linea {
    private Vector2 a;
    private Vector2  b;
    private  double longitud;
/**
    * Constructor que recibe como parámetros dos vectores
    * @param a un vector
    * @param b un vector
     **/
     public Linea ( Vector2  a , Vector2  b ) {
        this.a = a;
        this.b = b;
    }
    /**
     * Constructor que recibe como parámetros dos coordenadas
     * @param v1 un numero para coordanada x
     * @param v2 un numero para coordenada y
     * @param a un vector 
     * @param a un vector 
    * */
     public Linea ( double  x1 , double  y1 , double  x2 , double  y2 ) {
        Vector2 v1 =  new  Vector2 (x1, y1);
        Vector2 v2 =  new  Vector2 (x2, y2);
        this.a = v1;
        this.b = v2;
     }
    /**
    * Constructor sin parámetros que inicializa los atributos
    * */
      public Linea () {
         Vector2 v1 =  new  Vector2 ();
         Vector2 v2 =  new  Vector2 ();
         this.a = v1;
         this.b = v2;
     }
    public void setA ( Vector2  a ) {
        this.a = a;
    }
    public void  setB ( Vector2  b ) {
        this.b = b;
    }
    public void setLongitud ( double  longitud ) {
        this.longitud = longitud;
    }
    public  Vector2  getA () {
        return this.a;
    }
    public  Vector2  getB () {
        return this.b;
    }
    public  double  getLongitud () {
        return   this.longitud;
    }
    /**
    * Metodo toSVG que regresa una cadena con la representación de la línea en svg
    * @return una cadena en formato svg
    * */
    public  String  toSVG () {
        String linea = "<line x1=" + "\""+ Double.toString(a.getX())+"\"" +  "y1=" + "\""+ Double.toString(a.getY())+ "\"" + "x2=" + "\"" + Double.toString (b.getX()) + "\"" + "y2=" + "\""+ Double.toString(b.getY()) + "\""+ "style=" + "\"stroke:rgb(0,0,0);stroke-width:2\"" + "/>" ;
        return linea  ;
    }
    @Override
    /**
    * Metodo toString que regresa los atributos de la línea
    * @return una cadena con sus caracteristicas
     * */
    public  String  toString () {
        String linea =  " La línea va del vector "  + a +  " a el vector "  + b;
        return linea ;
    }
    @Override
    /**
    * Metodo equivale a que compara dos lineas
    * @return true si las lineas son iguales, false en otro caso
    * */
    public  boolean  equals ( Object  v ) {
        Linea z = (Linea) v ;
        return  a == z . getA () && b == z . getB () && longitud == z . getLongitud ();
    }
}