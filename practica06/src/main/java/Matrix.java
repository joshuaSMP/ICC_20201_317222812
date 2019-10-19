
/**
 * 
 * @author Johua Said Montaño Pérez 
 * Clase que modela una matriz a partir de un arreglo bidemensional y permite
 * realizar operaciones 
 */
public class Matrix{
    public double [][] mat;
//Construye una matriz vacia de n por m
/* Constructor que produce una matriz de nxm vacia
* 
* @param n - Renglones
* @param m - Columnas
*/
    public Matrix(int n, int m){
        if (n > 0 && m > 0){
            mat = new double[n][];
            for (int i=0; i<n; i++){
                mat[i] = new double[m];
                for(int j= 0; j <mat[i].length;j++){
                    mat[i][j] = 0;
                }
            }
        }else new Error ("Valores incorrectos para la matriz ");
    }
//Construye una matriz dado un arreglo
/**
* Constructor que produce a partir de un arreglo bidemensional declarado
* 
* @param array - Arreglo bidemensional
*/
    public Matrix(double[][] array){
        mat = new double[array.length][];
        for (int i=0; i < mat.length; i++){
            mat[i] = new double [array[i].length];
            for (int j =0; j< array[i].length; j++){
                mat[i][j] = array[i][j];
            }
        }
    }
//Función que calcula producto escalar
/**
* Metodo que calcula el metodo escalar de una matriz
* 
* @param scalar - El escalar que se usara para llevar a cabo metodo
*/
    public void scalarProduct(double scalar){
    double[][] nuevo = new double[mat.length][mat[0].length];
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            nuevo [i][j] = scalar * mat[i][j];
        }
    }
}
    
//Función que calcula suma de matrices
/**
* Metodo que suma 2 matrices del mismo tamaño
* 
* @param m - La matriz con la cual se realizara la suma
*/
    public void add(Matrix m){
        if (m.mat.length != mat.length||m.mat[0].length != mat[0].length){
        new Error ("No tienen la mismas dimensiones ");
        }else{
            for(int i=0;i<mat.length;i++){
                for(int j=0;j < mat[0].length;j++){
                    mat[i][j] = mat[i][j] + m.mat[i][j];
                }
            }
        }
    }
        
//Función que calcula producto de matrices
/**
* Metodo que multiplica 2 matrices
* 
* @param m - Matriz con la cual se realizara el producto
*/
    public void matrixProduct(Matrix m){
        if(m.mat.length !=mat.length|| m.mat[0].length !=mat[0].length){
            new Error("No tienen la misma dimensiones");
        }else{
            for(int i=0;i< mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    mat[i][j] = mat[i][j]* m.mat[i][j];
                }
            }
        }
    }
    
//Función que obtiene el elemento i j
/**
* Metodo que obtiene el elemento que se encuentra en la posicion que ingresemos
* 
* @param i - Renglon
* @param j - Columna
* @return - El elemento
*/
    public double getElement(int i, int j){
        while(i< mat.length && j <mat[0].length ){
            return mat[i][j];
        }
        return 0;
    }
//function set element
/**
* Metodo que permite ingresar y remplazar un elemento en la posicion que
* ingresemos
* 
* @param i - Renglon
* @param j - Columna
* @param e - Elemento que se quiere ingresar
*/
    public void setElement(int i, int j,double e){
        mat[i][j] = e;
    }
//Función que calcula el determinante si es nxn
/**
* Metodo que calcula el determinante de una matriz nxn
*/
    public double determinant(){
        if(mat.length!=mat[0].length){
            return 0;   
        }
        double res =0;
        if (mat.length == 1){
            res = mat [0][0];
            return res;
        }
        if (mat.length ==2){
            res = ((mat [0][0]* mat [1][1])-(mat[0][1]*mat[1][0]));
            return res;
        }
        return res;
    }
//Función que te dice si 2 matrices son iguales
/**
* Metodo que nos dice si 2 matrices son iguales con respecto a su tamaño y a
* sus elementos
* 
* @param o - Matriz a comparar
* @return - true si son iguales, false en otro caso
*/
    @Override
    public boolean equals(Object o){
        boolean a = true; 
        if(o instanceof Matrix){
            Matrix p = (Matrix)o;
            for(int i = 0; i <mat.length; i++){
                for(int j = 0; j <mat[0].length; j++){
                        if(mat[i][j] != p.getElement(i, j)){
                            a = false;
                    }
                }
            }
            
        } return a;
    }    


}

