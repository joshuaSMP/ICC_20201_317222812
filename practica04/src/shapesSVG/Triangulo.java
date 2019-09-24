package shapesSVG;

import sun.font.TrueTypeFont;

/**
 * Clase ue modela un triangulo
 **/

public class Triangulo{
        private Vector2 a;
        private Vector2 b;
        private Vector2 c;
        private double perimetro;
        private double area;

    /**
    * Constructor que recibe tres vectores
    * @param a un vector
    * @Param b un vecto
    * @param c un vector
    **/
   
    public Triangulo(Vector2 a, Vector2 b , Vector2 c){
        this.a = a ;
        this.b = b ; 
        this.c = c ;
    }
    /**
    * Constructorque recibe como parámetros tres vectores
    * @param x1 un numero para coordenada x
    * @param y1 un numero para coordenada y
    * @param x2 un numero para coordenada x
    * @param y2 un numero para coordenada y
    * @param x3 un numero para coordenada x
    * @param y3 un numero para coordenada y
    **/
    public Triangulo(doubel x1, double y1, double x2, double y2, double x3, doue y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    /**
    * Constructor vacio que inicializa los valores
    **/
    public Triangulo(){
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
        this.x3 = 0;
        this.y3 = 0;
    }
    /**
    * Metodos getters que regresan el perimetro y area
    * @return perimetro del trinagulo
    * @return area del triangulo
    **/    
    public void setx1(double x1){
        this.x1 = x1;
    }
    public void sety1(double y1){
        this.y1 = y1;
    }
    public void setx2(double x2){
        this.x2 = x2;
    }
    public void sety2(double y2){
        this.y2 = y2;
    }
    public void setx3(double x3){
        this.x3 = x3;
    }
    public void sety3(double y3){
        this.y3 = y3;
    }
    /**
    * Metodos getters que regresan el perimetro y area
    * @return perimetro del trinagulo
    * @return area del triangulo
    **/    
    public double getx1(){
        return this.x1;
    }
    public double gtey1(){
        return this.y1;
    }
    public double getx2(){
        return this.x2;
    }
    public double gtey2(){
        return this.y2;
    }
    public double getx3(){
        return this.x3;
    }
    public double gtey3(){
        return this.y13;
    }
    /**
    * Metodo toSVG regresa una cadena representando a un triangulo en svg
    @return una figura geometrica
   **/
    public String toSVG(){
        String trian= " <puntos de polígono = ' "  +  this. v1 . getX () +  " , " +  this. v1 . getY () +  "  "  +
        this. v2 . getX () +  " , "  +  this. v2 . getY () +  "  "  + this. v3 . getX () +  " , "  +  this. v3 . getY () +   " ' "  +  " fill =' green 'stoke-width =' 2 ' "  +  " /> ";

    }
    /**
    * Metodo toString regrga los taributos del triangulo
    * @return las caracteristicasdel triangulos
    **/
    @Override
        public String toString(){
            Triangulo triangulo =  new  Triangulo ();
            return  " Triangulo " + " La primer cordenada es :( "  +  this . v1 . getX () +  " , "  +  this . v1 . getY () + " ) "  +  " La segunda cooordenada es :( "  +  this . v2 . getX () +  " , "  +  this .v2. getY () +  " ) "  + 
                " La tercera coordenada es :( "  +  this . V3 . GetX () +  " , "  +  this . V3 . GetY () +  " ) "  +  " Perímetro: "  +  this . por  +  " Área: "  +   this. área ;
            
    }
    /**
    * Metodo equivale a que compara dos triangulos
    * @return true si son iguales, en otro caso false
    **/
    public boolean equals(Object v){
        Triangulo tri =  new  Triangulo ();
        Triangulo tri1 =  new  Triangulo ();
        if (t .equals (tri1));
        return True;
        return False ;
        }
  
}












