import shapesSVG.Vector2;
import shapesSVG.Linea;
import shapesSVG.Rectangulo;
import shapesSVG.Triangulo;
import shapesSVG.Circulo;
public class Main{
    public static void main (String[] args){

        String ini = "<svg height='700' width='700'>";
        String cie = "</svg>";
        Vector2 x = new Vector2(200, 200);

        Circulo c= new Circulo(50.0,50.0, 10.0);
        
        Linea y = new Linea(70.0, 70.0, 20.0 , 20.0);
        
        Rectangulo z = new Rectangulo(30.0, 40.0, 90.0 , 60.0 );
        
        Triangulo t = new Triangulo(80.0, 60.0, 50.0, 55.0, 90.0, 100.0);


        System.out.println(ini);
        System.out.println(y.toSVG());
        System.out.println(z.toSVG());
        System.out.println(x.toSVG());
        System.out.println(c.toSVG());
        System.out.println(t.toSVG());
        System.out.println(cie);
        
    }
}