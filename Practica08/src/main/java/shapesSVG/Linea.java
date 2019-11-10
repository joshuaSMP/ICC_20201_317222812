package shapesSVG;
import java.lang.Math;
 /** Clase que crea una linea usando vectores */

public class Linea {
 private Vector2 a;
 private Vector2 b;
 private double longitud = 0;
 


  /**Metodo de contructor  */
public Linea(Vector2 a, Vector2 b) {
    this.a = a;
    this.b = b;
    this.longitud = a.longitud(a,b);    

}
  /**Metodo de contructor vacío*/
  public Linea(){
    this.a = new Vector2(0,0);
    this.b = new Vector2(0,0);
  }
  
  /** Metodo contructor de vector para un punto de la linea */
  public Linea(double x1, double y1, double x2, double y2){
    Vector2 vector1 = new Vector2(x1,y1);
    Vector2 vector2 = new Vector2(x2,y2);
    this.a = vector1;
    this.b = vector2;
    double longitud = vector2.longitud(vector1,vector2);
  }
  
  /** convertir el SVG a un String */
  public String toSVG(){
    String crearLinea = "<line x1=" + "\""+ Double.toString(a.getX())+"\"" +  "y1=" + "\""+ Double.toString(a.getY())+ "\"" + "x2=" + "\"" + Double.toString (b.getX()) + "\"" + "y2=" + "\""+ Double.toString(b.getY()) + "\""+ "style=" + "\"stroke:rgb(0,0,0);stroke-width:2\"" + "/>" ;
      return crearLinea;
    
  /** metodo para crear el String  */
  }
  
  public String toString (){
    
    String stringA = a.toString() + b.toString() + "La longitud es: "  +Double.toString(longitud);
    return stringA; 
  }
  
  
  /** Creacion de los Getters y Setters de la clase*/
  public Vector2 getA(){
  return this.a;
  }
  
  public Vector2 getB(){
   return this.b; 
  }
  
  public double getLongitud() {
    return this.longitud;  
  }
  public void setA(Vector2 newA){
    this.a= newA;
  }
  public void setB(Vector2 newB){
    this.b = newB; 
  
  }
  
  /** metodo equals que compara los vectores para ver si son iguales */
  
  public boolean equals (Object line){
   
    Linea linea = (Linea)line;
    return this.a.equals(linea.getA()) &&  this.b.equals(linea.getB()); 
  
  }
}
