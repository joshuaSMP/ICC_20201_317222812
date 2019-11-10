package shapesSVG;
import java.lang.Math;
import static java.lang.Math.PI;

/** Clase que crea un circulo que extiende a Shape*/

public class Circulo extends Shape{

    private Vector2 centro;
    private Double radio;
    private Double perimetro;
    private Double area;


    /**Metodos constructores de la clase */

    public Circulo (Vector2 centro, Double radio){

        super();
        this.centro = centro;
        this.radio = radio; 
        this.perimetro = calculaPerimetro();
        this.area = calculaArea();

    }

    public Circulo (Double x, double y, Double radio){

        super();
        this.centro= new Vector2(x , y);
        this.radio = radio;
        this.perimetro = calculaPerimetro();
        this.area= calculaArea();

    }

    public Circulo (){
        super();
        this.centro= new Vector2 (0,0);
        this.radio = 0.0;
        this.perimetro = calculaPerimetro();
        this.area = calculaArea();

    }

    /**Metodos abstractos*/
    
   
    public double calculaArea(){
       return (Math.PI)* (radio*radio);
    }
  
    public double calculaPerimetro(){
       return 2*(Math.PI)*(radio) ;
   }
  

    /**Creación de los getters y setters */

    public Vector2 getCentro(){
        return this.centro;
    }
  
    public Double getRadio(){
        return this.radio;
    }
    public void setCentro(Vector2 newCentro){
        this.centro = newCentro;
    }
    public void setRadio(Double newRadio){
        this.radio = newRadio;
    }
 

    /**Metodo toString que convierte de SVG a una cadena */

    public String toSVG(){

            String stringCirc = "<circle " + "cx=" + "\""+Double.toString(this.centro.getX())+"\"" + "cy= " +"\"" +Double.toString(this.centro.getY())+"\"" + "r=" + "\""+Double.toString(this.radio)+"\"" + "fill="+ "\"pink\"" + "stroke=" + "\"green\"" + "stroke-width="+ "\"3.0\"" + "/>";
            return stringCirc;
    }



    /**Metodo del string que nos da los valores */

    @Override
    public String toString(){
        return "Centro: "+this.centro.toString()+"\n"+
               "Radio: "+this.radio+"\n"+
               super.toString();
    }

    /**
     *Método equals 
     **/
    @Override
    public boolean equals(Object clo){
        if(!(clo instanceof Circulo)) return false;
        @SuppressWarnings("unchecked") Circulo cir = (Circulo) clo;
        return this.radio == cir.getRadio() && this.centro.equals(cir.getCentro());
    }


}

