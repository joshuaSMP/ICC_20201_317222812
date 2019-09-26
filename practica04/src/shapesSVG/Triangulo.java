/**
* Clase que simula el comportamiento de un Triangulo 
* */
package shapesSVG;


public class Triangulo {
    private Vector2 a = new Vector2();
    private Vector2 b = new Vector2();
    private Vector2 c = new Vector2();
    private double perimetro ;
    private double area;
    /**
    * Constructor con parámetros
    * @param x eje abscisa
    * @param y eje ordenada
    */
public Triangulo (Vector2 a, Vector2 b, Vector2 c){
    this.a=a;
    this.b=b;
    this.c=c;
    this.perimetro = a.longitud(a, b) + b.longitud(b, c) + c.longitud(c, a);
    Vector2 puntoMedio = a.puntoMedio(b);
    this.area = (a.longitud(a, b) * (puntoMedio.longitud(puntoMedio,c)))/2;
}
public Triangulo (double x1,double y1, double x2, double y2, double x3, double y3 ){
  this.a = new Vector2(x1, y1);
  this.b = new Vector2(x2, y2);
  this.c = new Vector2(x3, y3);
  this.perimetro = a.longitud(a,b)+ b.longitud(b,c) + c.longitud(c,a) ;
  Vector2 puntoMedio= a.puntoMedio(b);
  this.area = (a.longitud(a,b) * (puntoMedio.longitud(puntoMedio,c)))/2;
}
/**
* Constructor sin parámetros que inicializa los atributos
*/
public Triangulo (){
this.a= new Vector2(0,0);
this.b= new Vector2(0,0);
this.c = new Vector2(0,0);
this.perimetro=0;
this.area=0;

}
/**
* Metodo getX que regresa la coordenada x de un Vector
* @return x la coordenada x del vector
*/
public void setperimetro(double perimetro){
  this.perimetro = perimetro;
}
  public void setarea(double area){
    this.area = area;
  }
  
public double getPerimetro(){
    return this.perimetro;
}

public double getArea(){
    return this.area;
}
/**
* Metodo toSVG que regresa la representación de una figura en svg en forma de cadena
* @return una figura geometrica
* */
public String toSVG(){
    String ve = "<polygon points=" + "\""+Double.toString(this.a.getX()) + "," + Double.toString(this.a.getY()) +"," + Double.toString(this.b.getX()) +","+ Double.toString(this.b.getY()) + ","+ Double.toString(this.c.getX()) + "," + Double.toString(this.c.getY())+ "\"" + "style=" + "\"fill:pink;stroke:purple;stroke-width:5\""+ " />" ;
        return ve;
}

 
    /**
     * Metodo equivale a que compara dos vectores
     * @return true en caso de ser iguales, false en otro caso
     * */
    public  boolean  equals () {
  Vector2 vec =  new  Vector2 ();
  Vector2 vec1 =  new Vector2 ();
  if (vec . equals (vec1));
    return true ;
      }
  

}