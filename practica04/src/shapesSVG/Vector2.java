
package shapesSVG;

/**
* Clase que simula el comportamiento de un Vector
* */
public class Vector2{
    private double x;
    private double y;
    private double magnitud;
    /**
    * Constructor con parámetros
    * @param x eje abscisa
    * @param y eje ordenada
    */
public Vector2(double x, double y, double magnitud ){
    this.x=x;
    this.y=y;
    this.magnitud=magnitud;
}
/**
* Constructor sin parámetros que inicializa los atributos
*/
public Vector2(){
this.x=0;
this.y=0;
this.magnitud=0;

}
/**
* Metodo getX que regresa la coordenada x de un Vector
* @return x la coordenada x del vector
*/
public double getX(){
    return this.x;
}

public double getY(){
    return this.y;
}
/**
* Metodo toSVG que regresa la representación de una figura en svg en forma de cadena
* @return una figura geometrica
* */
public String toSVG(){
    String vec=    this. x +  " ' "  +  " cy =' " +  this. y +  " ' "  +  " r =' 2 ' "  +  " stroke-width =' 1 ' "  +   " fill =' blue ' "  +  " /> ";
}

 
    /**
     * Metodo equivale a que compara dos vectores
     * @return true en caso de ser iguales, false en otro caso
     * */
    public  boolean  equals () {
	Vector2 vec =  new  Vector2 ();
	Vector2 vec1 =  new Vector2 ();
	if (v . equala (vec1));
    return True ;
	return False; 
    }

}