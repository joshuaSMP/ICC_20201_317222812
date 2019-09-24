import shapesSVG.Vector2;
import shapesSVG.Linea;
import shapesSVG.Rectangulo;
import shapesSVG.Triangulo;
import shapesSVG.Circulo;
public class Main{
    public static void main (String[] args){

        Vector2 x = new Vector2(200, 200);
        String ini = "<svg height='700' width='700'>";
        String cie = "</svg>";
        System.out.println(ini);
        System.out.println(x.toSVG());
        System.out.println(cie);
        Linea y = new Linea(400, 400);
        String in = "<svg height='700' width='700'>";
        String ci ="</svg>";
        System.out.println(ini);
        System.out.println(y.toSVG());
        System.out.println(cie);
        Rectangulo z = new Rectangulo(60, 30);
        String inic = "<svg height='700' width='700'>";
        String cier ="</svg>";
        System.out.println(ini);
        System.out.println(z.toSVG());
        System.out.println(cie);
        Triangulo t = new Triangulo(100, 50);
        String inici = "<svg height='700' width='700'>";
        String cierr ="</svg>";
        System.out.println(ini);
        System.out.println(t.toSVG());
        System.out.println(cie);
        Circulo c= new Circulo(40, 40);
        String inicio = "<svg height='700' width='700'>";
        String cierre ="</svg>";
        System.out.println(ini);
        System.out.println(c.toSVG());
        System.out.println(cie);



    }
}