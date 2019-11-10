import java.util.Iterator;
import java.util.NoSuchElementException;
/** Clase que crea diferentes metodos para la matriz */

public class Matrix implements Iterable<Double>{
    private double [][] matriz;


    
    /** metodo que nos calcula suma de matrices
    @param Matrix m*/ 
    public void add(Matrix m){
        if (m.matriz.length != matriz.length||m.matriz[0].length != matriz[0].length){
        new Error ("No tienen la mismas dimensiones ");
        }else{
            for(int i=0;i<matriz.length;i++){
                for(int j=0;j < matriz[0].length;j++){
                    matriz[i][j] = matriz[i][j] + m.matriz[i][j];
                }
            }
        }
    }
        
    /** Metodo que nos calcula el producto de matrices*/
    public void matrixProduct(Matrix m){
        if(m.matriz.length !=matriz.length|| m.matriz[0].length !=matriz[0].length){
            new Error("No tienen la misma dimensiones");
        }else{
            for(int i=0;i< matriz.length;i++){
                for(int j=0;j<matriz[0].length;j++){
                    matriz[i][j] = matriz[i][j]* m.matriz[i][j];
                }
            }
        }
    }
    
    /**Metodo  que obtiene el elemento i j de uha matriz
    @param int i, 
    @param int j, */
    public double getElement(int i, int j){
        while(i< matriz.length && j <matriz[0].length ){
            return matriz[i][j];
        }
        return 0;
    }
    /**Metodo que obtiene el resultado de dos matrices
    @param int i
    @param int j
    @param double e*/
    public void setElement(int i, int j,double e){
        matriz[i][j] = e;
    }

    /**Metodo que calcula el determinante si es nxn*/
    public double determinant(){
        if(matriz.length!=matriz[0].length){
            return 0;   
        }
        double determinante =0;
        if (matriz.length == 1){
            determinante = matriz [0][0];
            return determinante;
        }
        if (matriz.length ==2){
            determinante = (matriz [0][0]* matriz [1][1])-(matriz[0][1]* matriz[1][0]);
            return determinante;
        }
        return determinante;
    }

   
    

    /**Metodo que te dice si 2 matrices son iguales
    @param Object o
    y devuelve un booleano*/
    @Override
    public boolean equals(Object o){
        boolean a = true; 
        if(o instanceof Matrix){
            Matrix p = (Matrix)o;
            for(int i = 0; i <matriz.length; i++){
                for(int j = 0; j <matriz[0].length; j++){
                        if(matriz[i][j] != p.getElement(i, j)){
                            a = false;
                    }
                }
            }
            
        } return a;
    }    



@Override

  public Iterator <Double> iterator() {
     return new MatrixIterator();
 }
    
private class MatrixIterator implements Iterator <Double>{
    private int columna=1;
    private int fila= 0; 

    
      private boolean hasNextColumna(){
        return (columna < matriz[0].length-1)?true:false;
        }

      private boolean hasNextFila(){
        return (fila < matriz.length-1)?true:false;
      }

      @Override
      public boolean hasNext(){
        if (this.hasNextColumna()){
            return true;
        }else{
            return (this.hasNextFila())?true:false;
        }
      }
     
       
     @Override
     public Double next(){
        if (hasNext()){
            if(hasNextColumna()){
                columna++;
            }
            else{
                columna=0;
                if(hasNextFila()){
                    fila++;
                }
            }
            return Matrix.this.matriz[this.fila][this.columna];
        }
        return null;
      }

    }   
}  