package shapesSVG;
/** Clase que construye un triangulo que extiende a Shape e implementa Transformation*/

public class Triangulo extends Shape {
  private Vector2 a;
  private Vector2 b;
  private Vector2 c;
  private double perimetro;
  private double area;
  
  /** Constructores de la clase Triangulo*/
  
  public Triangulo (Vector2 a, Vector2 b, Vector2 c ){
    
    super();
    this.a = a ;
    this.b = b ;
    this.c = c ;
    this.perimetro =calculaPerimetro();
    this.area = calculaArea();
    
    
  }
  
  public Triangulo (double x1, double y1, double x2, double y2, double x3, double y3 ) {

    super();
    this.a = new Vector2 (x1,y1);
    this.b  = new Vector2 (x2,y2);
    this.c = new Vector2 (x3,y3);
    this.perimetro = calculaPerimetro();
    this.area = calculaArea();
    
  }
  
  public Triangulo (){
    super();
    this.a= new Vector2(0,0);
    this.b= new Vector2(0,0);
    this.c= new Vector2(0,0);
    this.perimetro=calculaPerimetro();
    this.area=calculaArea(); 
    
  }

  /**Metodo transforma de la interfaz Transformation*/
    public void transforma( Transformation t){
      this.a = t.transforma(this.a);
      this.b = t.transforma(this.b);
      this.c = t.transforma(this.c);
    }
  /**metodos abstractos*/

    public double calculaPerimetro(){
       return this.perimetro = a.longitud(a,b) + b.longitud(b,c) + c.longitud(c,a);
    }
     public double calculaArea(){
        return  this.area = (a.longitud(a,b) * ((a.puntoMedio(b)).longitud(a.puntoMedio(b),c)))/2;
      }

 /** metodo que convierte un SVG  a un String*/
  public String toSVG (){
    String stringTriangulo= "<polygon points=" + "\""+Double.toString(this.a.getX()) + "," + Double.toString(this.a.getY()) +"," + Double.toString(this.b.getX()) +","+ Double.toString(this.b.getY()) + ","+ Double.toString(this.c.getX()) + "," + Double.toString(this.c.getY())+ "\"" + "style=" + "\"fill:pink;stroke:purple;stroke-width:5\""+ " />" ;  
    return stringTriangulo;
  }
      
  /** metodo String que nos da los atrubutos*/ 
    
    public String toString (){
      
      String stringTriangulo = "El vector a es " + this.a + ",el vector b es " + this.b + ", el vector c es "+ this.c + ", el perimetro es " + this.perimetro + "y su area es " + this.area ;
      return stringTriangulo; 
    
  }
    
    
    /**creacion de los getters y los setters*/ 
    public Vector2 getA (){
      return this.a;
    }
    public Vector2 getB(){
      return this.b;
    }
    public Vector2 getC(){
      return this.c;
    }
    public void setA (Vector2 newA){
        this.a = newA;
    }
    public void setB (Vector2 newB){
      this.b = newB;
    }
    public void setC (Vector2 newC){
      this.c = newC; 
    }

    
    
    /** Metodo equals que compara los atributos de la clase */
    public boolean equals (Object triangle){
      Triangulo triangulo = (Triangulo) triangle;
      return  this.a.equals(triangulo.getA()) && this.b.equals(triangulo.getB()) &&  this.c.equals(triangulo.getC()) && this.perimetro == triangulo.getPerimetro() && this.area == triangulo.getArea(); 
    }

  
    
  }
  
