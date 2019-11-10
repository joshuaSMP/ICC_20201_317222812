package shapesSVG;

public class Vector2{
    private double x;
    private double y;
    private double magnitud;


/**Constructor vacío */
public Vector2() {
this.x = 0;
this.y = 0;
this.magnitud = 0;
}
/**Constructor común */


public Vector2(double x, double y ){
    this.x = x;
    this.y = y;
    double suma = Math.pow(x-0,2) - Math.pow(y-0,2);
    this.magnitud =  Math.sqrt(suma);

}

/**Creación de los getters para acceder a los atributos privados */
public double getX(){
    return this.x;

}

public double getY(){
    return this.y;

}

public double getMagnitud(){
    return this.magnitud;
}
/** Metodo para calcular la longitud de a y b */
  public double longitud(Vector2 a, Vector2 b){
    double suma = Math.pow(b.getX() - a.getX(),2) - Math.pow(b.getY() -   a.getY(),2);  
    return Math.sqrt(suma);
  }

/** to SVG() -> cadena */
public String toSVG(){
  String aux = "<circle cx="+ "\""+ Double.toString(getX())+"\"" + "cy=" + "\""+Double.toString(getY())+"\"" + "r="+ "\"10\"" + "stroke="+ "\"blue\"" + "stroke-width="+ "\"1\"" + "fill="+ "\"red\""+ "/>";
  return aux;
}

/**Metodo  que calcula el punto medio entre dos vectores  */
public Vector2 puntoMedio(Vector2 v){
    double newX = (this.x+v.x)/2;
    double newY = (this.y+v.y)/2;
    return new Vector2(newX,newY);
}

/** to String() -> Cadena  
 * @param vector2*/

public String toString (Vector2 vector2){
String a= "El atributo x  = " + this.x + "\n" + ", el atributo y = " + this.y + "\n" + "el atributo magnitud =" +  this.magnitud +"\n" ;  
return a; 
 }


/** equals () */
public boolean equals (Object vec ){
Vector2 vector2 = (Vector2)vec;
return x == vector2.getX() &&  y == vector2.getY();  
   
}


}
