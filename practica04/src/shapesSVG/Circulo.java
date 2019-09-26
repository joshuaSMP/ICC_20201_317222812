/**
 * Clase que modela un círculo 
 */
package shapesSVG ;
public class  Circulo {
     private Vector2 a ;
     private double radio  ;
     private double diametro ;
     private double area ;
    /**
     * Parámetros de la clase circulo
     * @param a - Punto con el cual se crea el círculo
     * @param radio - Radio del circulo
     * @param diametro - Diametro del circulo
     * @param area - Área del circulo
     */

     /**
      * Constructor que pide el punto que será el centro de círculo y un radio
      * @param a - Centro del circulo
      * @param radio - Radio del circulo
      */
     public Circulo( Vector2  a ,double radio ) {
        this.a = a;
        this. radio = radio;
        this. diametro = ( this. radio *  2 );
        this. area = (( this . radio *  this . radio) *  3.141592 );
    }
    /**
     * Constructor que recibe la coordenada en xy en y de un punto, y el radio
     * @param x - Coordenada de en x del punto
     * @param y - Coordenada de en y del punto
     * @param radio - Radio del circulo
     */
     public Circulo ( double  x , double  y , double  radio ) {
        Vector2 v1 =  new  Vector2 (x, y);
        this.a = v1;
        this.radio = radio;
        this.diametro = ( this.radio *  2 );
        this.area = (( this.radio *  this .radio) *  3.141592 );
    }
    /**
     * Constructor que no recibe nada y que pone el centro del círculo en (100, 100) y asigna un radio = 50
     */
     public Circulo () {
        Vector2 v1 =  new  Vector2 ( 100.0 , 100.0 );
        this.a = v1;
        this.radio =  50 ;
        this.diametro = ( this.radio *  2 );
        this.area = (( this.radio *  this.radio) *  3.141592 );
    }
    /**
     * Creación de setters
     */
    public void setA ( Vector2  a ) {
        this.a = a;
    }
    public  void  setRadio ( double radio ) {
        this.radio = radio;
    }
    public  void  setDiametro ( double  diametro ) {
        this.diametro = diametro;
    }
    public  void  setArea ( double area  ) {
        this.area = area;
    }
    /**
     * Creación de getters
     */
    public  Vector2  getA () {
        return  this. a;
    }
    public  double  getRadio () {
        return   this. radio;
    }
    public  double  getDiametro () {
        return   this. diametro;
    }
    public  double  getArea () {
        return  this. area;
    }
    /**
     * Metodo que permite que nuestro círculo sea libremente gráfico, regresa una cadena que representa la representación del círculo en SVG
     * @return String - La representación del círculo en SVG
     */
    public  String  toSVG () {
        String cir =  " <circle cx = ' " + Double.toString ( this.a.getX ()) + " 'cy =' " + Double.toString ( this.a.getY ()) + " 'r =' " + Double.toString ( this.radio) + " 'fill =' " + " pink " + " 'stroke ='blue " + " 'stroke-width =' " + " 6.0 " + " '/> " ;
        return cir;
    }
    /**
     * Metodo para convertir un círculo a una cadena de caracteres
     * @return String - Un círculo en forma de cadena
     */
    @Override
    public  String  toString () {
        String circulo  =  " El circulo tiene centro en: " + a  +  " y tiene radio de: " + radio;
        return circulo;
    }
    /**
     * Metodo que compara si 2 circulos son iguales, si son asi regresa verdadero, en otro caso falso
     * @param v - Círculo con el cual se va a comparar
     * @return boolean - true si 2 circulo son iguales, false si no
     */
    @Override
    public  boolean  equals ( Object  v  ) {
        Circulo z = ( Circulo ) v ;
        return  a == z.getA () && radio == z.getRadio ();
    }
}