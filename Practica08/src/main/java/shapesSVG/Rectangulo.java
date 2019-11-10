package shapesSVG;
import java.lang.Math;


/** Clase que crea un rectangulo que extiende a Shape */


public class Rectangulo extends Shape{
  private Vector2 a;
  private double ancho;
  private double alto;
  private double perimetro;
  private double area; 
  
  
  /** Constructores de la clase Rectangulo*/

  public Rectangulo (Vector2 a, double ancho, double alto ){
    super();
    this.a = a ;
    this.ancho = ancho;
    this.alto = alto; 
    this.perimetro = calculaPerimetro(); 
    this.area = calculaArea();
    
  }
  
  
  public Rectangulo (double x, double y, double ancho, double alto){

    super();
    this.a = new Vector2(x,y);
    this.ancho = ancho; 
    this.alto = alto;
    this.perimetro = calculaPerimetro();
    this.area = calculaArea(); 
    
    
  }
  
  public Rectangulo () {

    super();
    this.a = new Vector2(0,0);
    this.ancho = 0 ;
    this.alto = 0 ;
    this.perimetro = calculaPerimetro();
    this.area = calculaArea();    
      
  
  }
  
  
  /**Metodo que convierte un SVG a un String*/ 
  public String toSVG (){
    
    String rectangulo = "<rect x=" + "\""+Double.toString(this.a.getX())+"\"" + "y=" + "\""+Double.toString(this.a.getY())+"\""+  "width=" + "\""+this.ancho+"\""+ "height=" + "\""+this.alto+"\"" + "/>";
    return rectangulo; 
  
  }
   public double calculaArea(){
      return this.alto* ancho;
    }
    /* Método para calcular el perímetro */
  public double calculaPerimetro(){
      return this.alto * 2 + 2 * ancho;
    }
  
  /**Metodo que crea un String */
  
  public String toString () {
    String stringrectangulo = "El ancho es " + Double.toString(ancho) + "\n" + ", su altura es " + Double.toString(alto) + "\n" + "su perimetro es " + Double.toString(perimetro) + "\n" + "y su area es " + Double.toString(area) + "." + "\n" + "El vector es " + a.toString() ;      
    return stringrectangulo;
  }
   /** creación de los getters y setters */
  
  public Vector2 getA () {
    return this.a; 
  }
  
  public double getAncho () {
    return this.ancho;
  }
  public double getAlto (){
   return this.alto;
  }
  public double getPerimetro(){
    return this.perimetro;
  }
  public double getArea(){
    return this.area;  
  }
  public void setA( Vector2 newA){
    this.a = newA;
  }
  public void setAncho(double newAncho) {
    this.ancho = newAncho;
  }
  public void setAlto (double newAlto){
    this.alto = newAlto;
  }
  
  
  
  
  /**metodo equals*/

  
public boolean equals (Object rectangle) {
  
  Rectangulo rectangulo = (Rectangulo) rectangle ;
  return this.a.equals(rectangulo.getA()) && this.ancho == rectangulo.getAncho() && this.alto == rectangulo.getAlto() && this.perimetro == rectangulo.getPerimetro() && this.area == rectangulo.getArea(); 
  
}
}