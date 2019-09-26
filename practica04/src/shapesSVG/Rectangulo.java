
package shapesSVG ;
public class Rectangulo {
        private  Vector2 a;
        private double ancho;
        private  double alto;
        private double area;
        private double perimetro;
    
        public  Rectangulo ( Vector2 a , double  ancho , double  alto ) {
            this.a = a;
            this.ancho = ancho;
            this.alto = alto;
            this.area = ancho * alto;
            this.perimetro = ancho + ancho + alto + alto; 
        }
        public Rectangulo( double  x , double  y , double  ancho , double  alto ) {
            this.a = new Vector2(x, y);
            this.ancho = ancho;
            this.alto = alto;
            this.area = ancho * alto;
            this.perimetro = ancho + ancho + alto + alto; 
        }
        public Rectangulo(){
             this.a = new Vector2(0.0, 0.0);
             this.ancho = 0.0;
             this.alto = 0.0;
             this.area = 0.0;
            this.perimetro = 0.0; 
        }
        public void setA ( Vector2  a ) {
            this.a = a;
        }
        public void setAncho ( double  ancho ) {
            this.ancho = ancho;
        }
        public  void  setAlto ( double  alto ) {
            this.alto = alto;
        }
        public  void  setPerimetro (double perimetro   ) {
            this.perimetro = perimetro;
        }
        public  void  setArea ( double area  ) {
            this.area = area;
        }
        public  Vector2  getA () {
            return this.a;
        }
        public  double  getAncho () {
            return this.ancho;
        }
        public  double  getAlto () {
            return this.alto;
        }
        public  double  getPerimetro () {
            return this.perimetro;
        }
        public  double  getArea () {
            return this.area;
        }
         public  String  toSVG () {
            String recta =  "<rect x=" +"\""+Double.toString(this.a.getX()) +"\"" +  "y=" + "\""+Double.toString(this.a.getY())+"\"" +  "width="  +"\"" + this.ancho + "\"" + "height=" + "\""+this.alto+"\""+"/>";
            return   recta;
        }
        @Override
        public  String  toString () {
            String rect =  " El rectángulo tiene su vector "  + a +  " , tiene un alto de: "  + alto +  " y tiene un ancho de: "  + ancho;
            return rect;
        }
        @Override
        public  boolean  equals ( Object  v ) {
            Rectangulo z = ( Rectangulo ) v;
            return a == z.getA () && alto == z.getAlto () && ancho == z.getAncho ();
        }
    
    }