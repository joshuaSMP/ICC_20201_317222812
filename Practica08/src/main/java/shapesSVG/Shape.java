/**importamos el packete shapesSVG*/
package shapesSVG;
/**Clase abstracta de Shape*/

public abstract class Shape implements Comparable<Shape>{
  /**Atributos de la clase abstracta Shape*/
  protected double area;
  protected double perimetro;
  /* Constructor  de la clase Shape*/
  public Shape(){}
  
  /**Metodos abstractos*/
  abstract public double calculaArea();
  abstract public double calculaPerimetro();
  abstract public String toSVG();


  @Override
  public int compareTo(Shape shape){
    if(this.area < shape.getArea()) return -1;
    if(this.area> shape.getArea()) return 1;
    if(this.area == shape.getArea()) return 0;
    return -1; 
  }

  /**
  * Método equals para comparar área y perímetro
  **/
  @Override
  public boolean equals(Object o){
    if(!(o instanceof Shape)) return false;
    @SuppressWarnings("unchecked") Shape p = (Shape) o;
    return (p.calculaArea() == this.area) && (p.calculaPerimetro()==this.perimetro);
  }
  /**
  * Método toString 
  **/
  @Override
  public String toString(){
    return "Perímetro: "+this.perimetro+ ", Area: "+this.area;
  }
  /*Getters de la clase Shape*/
  public double getArea(){
     return this.area;
  }
  public double getPerimetro(){
     return this.perimetro;
  }
}