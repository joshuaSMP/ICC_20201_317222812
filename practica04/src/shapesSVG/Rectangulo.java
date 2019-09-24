package shapesSVG;
/**
 * Clase que modela un rectangulo
**/

public class Rectangulo{
        private Vector2 a;
        private double ancho;
        private double alto;
        private double perimetro;
        private double area;
        /**
        * Costructor que recibe como parámetros un vector, y dos numeros
        * @param v1 un vector
        * @param ancho un numero
        * @param double un numero
        **/
        public Rectangulo(Vector2 a, double ancho, double alto, double perimetro, double area){
            this.a = a ; 
            this.ancho = ancho;
            this.alto = alto; 
            this.perimetro = perimetro;
            this.area = area;
        }

    /**
    * Constructor que recibe como parámetros las coordenadas de un vector y dos numeros
    * @param x coordenada x
    * @param y coordenada y
    * @param ancho un umero
    * @param alto un numero
    **/
   
        public Rectangulo(double x, double y, double ancho, double altura){
            this.x = x;
            this.y = y;
            this.ancho = ancho;
            this.altura = altura;
        }
        /**
        * Constructor vacio que inicializa los valores
        **/
   
        public Rectangulo(){
            this.x = 0;
            this.y = 0;
            this.ancho = 0;
            this.alto = 0;    
        }
        /**
        * Metodos setters que regresan el ancho, alto, perimetro y area 
        * @return cancho el ancho de un rectangulo
        * @return alto el alto de un rectangulo
        * @return perimetro el perimetro de un rectangulo
        * @return area el area de un rectangulo
        **/
        public void setx(double x ){
            this.x = x ;
        }
        public void sety(double y){
            this.y = y; 
        }
        public void setancho(double ancho ){
            this.ancho = ancho;
        }
        public void setalto( double alto){
            this.alto = alto;
        }
        /**
     * Metodos getters que regresan el ancho, alto, perimetro y area
     * @return ancho el ancho de un rectangulo
     * @return alto el radio de un alto
     * @return perimetro el perimetro de un circulo
     * @return area el area de un circulo
     **/
        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double getancho(){
            return this.ancho;
        }
        public double getalto(){
            return this.alto;
        }
        /**
        * Metodo a SVG regresa una cadena con la representación del rectángulo en svg
        * @return una fugura geometrica
        **/
        public String toSVG(){
                String rec = "<rect x='"+Double.toString(this.a.getX())+"' y='"+Double.toString(this.a.getY())+"' width='"+Double.toString(ancho)+"' height='"+Double.toString(alto)+"' fill='"+"orange"+"' stroke='"+"green"+"' stroke-width='"+"2.0"+"'/>";
              return rec;
            }    
            /**
            * Metodo toString regresa los atributos de un rectangulo
            * @return una cadena con sus caracteristicas
            **/
            @Override
        public String toString(){
            Rectangulo rec =  new  Rectangulo ();
	return  " Rectángulo "  +  " El vector es: ( "  +  this . v1 . getX () +  " , "  +  this . v1 . getY () +  " ) "  +  " El acho del rectángulo es: "  +
	    this. ancho +  " La alura es: "  +  this. alto   +  " Su perímetro es: "  +  this. perimetro   +  " Su área es: "  +  this . área;
    }   
            /**
            * Metodo es igual a comparar a dos rectangulos
            * @return true si los rectangulos son iguales, false si no lo son
            **/
           
        public boolean equals(Object v){
            Rectangulo rec =  new Rectangulo ();
	        Rectangulo rec1 =  new  Rectangulo ();
	        if (r . equalsa (rec1));
	        return True;
	        return False;
    }
                



    }
