package shapesSVG;
/**Clase que modela un circulo
*/
public class Circulo{
        private Vector2 centro;
        private double radio;
        private double perimetro;
        private double area;
        /** 
        * Constructor que recibe como parámetros un vector y un numero
        * @param centro un vctor
        * @param radio un numero
        **/
    public Circulo(Vector2 centro, double radio){
        this.centro = centro;
        this.radio = radio ; 
    }
    /**
    * Constructor que recibe como parámetros un vector y un numero
    * @param x un numero para la coordenada x
    * @param y un numero para la coordenada y
    * @param radio un numero para el radio
    **/
    public Circulo(double x, double y, double radio ){
        this.x = x;
        this.y = y; 
        this.radio = radio;
    }
    /**
    * Constructor vacio ue inicializa los valores
    **/
    public Circulo(){
        this.x = 0;
        this.y = 0;
        this.radio = 0;
    }
    /**
     * Metodos setters que regresan el radio, perimetro y area 
     * @return radio el radio de un circulo
     * @return perimetro el perimetro de un circulo
     * @return area el area de un circulo
     **/
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    /**
     * Metodos getters que regresan el radio, area y perimetro
     * @return radio el radio de un circulo
     * @return perimetro el perimetro de un circulo
     * @return area el area de un circulo
     **/
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRadio(){
        return this.radio;
    }
    /**
     * Metodo toSVG que regresa una cadena co la representación de un círculo en svg
     @return una figura geometrica
    **/
    public String toSVG(){
        StrictMath cir="<circle cx='"+Double.toString(this.x)+"' cy='"+Double.toString(this.y)+"' r='"+"90.0"+"' fill='"+"blue"+"' stroke='"+"green"+"' stroke-width='"+"1.0"+"'/>";
    }
    /**
     * Metodo toSVG que regresa una cadena co la representación de un círculo en svg
     @return una figura geometrica
    **/
    @Override
    public String toString(){
        Círculo cr =  new  Círculo ();
	return  " Círculo "  +  " El centro que tiene el círculo es :( "  +  this . centro . getX () +  " , "  +  this . centro . getY () + " ) "  +  " Tiene como radio: "  +
	    this. radio +   " Tiene como primetro: "  +  this. perimetro  +  " Tiene como área: "  +  this. área ;
    }
    /**
    * Metodo es igual a la realización de la comparación entere dos circulos
    * @return true en caso de que sean iguales, false si no lo son
    **/
    public boolean equals(Object v){
        Círculo cr =  new Círculo ();
        Circulo cr1 =  new  Circulo ();
        if (cr. equal.a (cr1));
            return True ;
            return False ;
    }
    
    
    }
