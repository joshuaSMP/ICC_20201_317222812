package shapesSVG;
/**
 * Clase que modela una linea
**/
public class Linea{
    private Vector2 a;
    private Vector2 b;
    private double longitud;
    /**
    * Constructor que recibe como parámetros dos vectores
    * @param v1 un vector
    * @param v2 un vector
     **/
    public Linea(Vector2 a, Vector2 b, double longitud){
        this.a = a;
        this.b = b;
        this.longitud = longitud;
    }
    /**
     * Constructor que recibe como parámetros dos coordenadas
     * @param x1 un numero para coordanada x
     * @param y1 un numero para coordenada y
     * @param x2 un numero para coordenada x
     * @param y2 un numero para coordenada y
     * */
    public Linea(double x1,double y1,  double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    /**
    * Constructor sin parámetros que inicializa los atributos
    * */
    public Linea(){
        this.x = 0.0;
        this.y = 0.0;
    }
    public void setx1(double x1){
        this.x1 = x1;
    }
    public void sety1(double y1){
        this.y1 = y1;
    }
    public void setx2(double x12){
        this.x2 = x2;
    }
    public void sety2(double y2){
        this.y2 = y2;
    }

    public double getx1(){
        return this.x1;
    }
    public double gety1(){
        return this.y1;
    }
    public double getx2(){
        return this.x2;
    }
    public double gety2(){
        return this.y2;
    }
    /**
    * Metodo toSVG que regresa una cadena con la representación de la línea en svg
    * @return una cadena en formato svg
    * */
    public String toSVG(){
       String lin= "  +  este . v1 . getX () +  " ' "  +  " y1 =' "  +  esto . v1 . getY () +  " ' "  +  " x2 =' "  +  esto . v2 . getX () +  " ' "  +  " y2 =' "  +  esto . v2 . getY () +  " +  " stroke = 'red' "  +  " stroke-width = '1' "  +  " /> "  +  " \ n " ;


       /**
       * Metodo toString que regresa los atributos de la línea
       * @return una cadena con sus caracteristicas
       * */
    @Override
    public String toString(){
        " Línea "  +  " \ n "  +  " El vector inicial es: ( "  +  this . v1 . getX () +  " , "  +  this . v1 . getY () + " ) "  +  " \ n "  +
	    " El vector final es: ( "  +  this . V2 . GetX () +  " , "  +  this . V2 . GetY () +  " ) " +  " \ n "  +  " La longitud de la línea es: "  +  this . longitud +  " \ n " ;
    }
    /**
    * Metodo equivale a que compara dos lineas
    * @return true si las lineas son iguales, false en otro caso
    * */

    public boolean equals(){
        lin p = new linea ();
        lin q = new linea ();
        if (p.equals(q)){
            system.out.println(True);

        }else {System.out.print(False);}     
    
    }
        }
    




}

