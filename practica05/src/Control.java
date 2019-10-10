/**@autor Joshua Said Montaño Pérez 
 * primero importamas el paquete de Array y el de ArrayList 
 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Esta es la clase que ejecuta la practica05
 */
public class Control{
/**
 * En el primer problema vemos si una palabra es palindromo 
 * 
 * @param palabra - sirve para evaluar si es un palindromo
 * @return - true si la palabra es palindromo de lo contrario flase
 */
     public static boolean problema1(String palabra){
        int inicio = 0;
        int fin = palabra.length()-1; 
        boolean pal = true;
        while (inicio < fin){//lo que hace este while es que va checando caracter por caracter
            if (palabra.charAt(inicio)!= palabra .charAt(fin )){
                pal= false;
    }
    inicio++;
    fin--;
        }return pal;
    }
    /**
     * En el segungo problema damos un arreglo A y un numero K y determina si hay 2 numeros en el
     * arreglo que sumen K
     * @param arreglo - Es el arreglo que evalua si se encuntran los numeros 
     * @param k - La variable que utilizamos para que el resultado de la divicion nos de 0 
     * @return - true en caso de que el arreglo sea verdadero de lo contrario false
     */
    public static boolean problema2(int[] arreglo, int k){
      boolean suma = false ;
      for(int i=0; i< arreglo.length; i++){//se le asigna un numero y dentro de este for hay otro for que 
          for(int j=1; j< arreglo.length; j++){//para que asinge en siguiente numero 
              if(arreglo[i] + arreglo[j] ==k){
                  suma= true;
              }
          }
      }  return suma;
    }
    /**
     * En el tercer problema tenemos un arreglo A y regresa el mismo arreglo pero ordenado 
     * @param array -  El arreglo es el que nos ayuda a evaluar 
     */
    public static void problema3(int[] array){
      int aux;
      boolean cambio= false;
        while (true){//les asinganamos valores a los dos for y estos los comparan y si uno es mas grande que
            cambio= false ;// el otro cambian de posicion, hacen el mismo procedimiento hasta que el arreglo 
            for (int i=1;i<array.length;i++){//este arreglado
                if(array[i]<array[i-1]){
                    aux = array[i];
                    array[i] = array [i-1];
                    array[i-1] = aux;
                    cambio = true;
                }
            }
        if( cambio ==false)
            break;
        }
    }
    /**
     * En el problema 4 tenemos un metodo de busqueda binaria que dado un arreglo ordenado A
     * busca un número K y regresar true si está, false en otro caso.
     * @param arreglo - el arreglo que hara la busqueda binaria 
     * @param dato - el dato que buscamos 
     * @return - true si el numero esta de lo contrario false 
     */
    public static boolean problema4(int[] arreglo, int dato){
        int n = arreglo.length;
        int centro;
        int inf=0;
        int sup=n-1;
         while(inf<=sup){//realiza la busqueda del numero menor al maximo, hasta que encuentre
           centro=(sup+inf)/2;//al numero mayor parara 
           if(arreglo[centro]==dato) 
           return true;

           else 
           if(dato < arreglo[centro] ){
              sup=centro-1;
           }
           else {
             inf=centro+1;
           }
         }
         return false;
       
    }
    /**
     * En el problema 5 tenemos un metodo que nos permite saber si un numero es primo o no 
     * @param n - es el numero que sera evaluado para ver si es primo o no 
     * @return - true si el numero es primo de lo contraro false
     */
    public static boolean problema5(int n){
        if (n == 1 ) return false;//el for evalua si el numero es primo o no con una divicion entre 2 
        for (int i = 2 ;i <n; i++){// y si el residuo de la divivion es 0 entonces es primo 
            if (n%i == 0)return false ;
        }
        return true ;
    }
    
    /**
     * En el problema 6 tenemo el metodo que regresa los numros primos menores a N en un arreglo 
     * @param n - es el numero que sera nuestro parametro 
     * @return - el numero de primos antes que N 
     */
    public static int[] problema6(int n){
        int contador = 0; 
        for(int i = 1 ;i <=n ;i++){//en este primer for encontramos todos los primeros numeros primos  
            if(problema5(i)){//usando el metodo del problema 5 y el contador aumenta si encuentra uno 
                contador++;
            }
        }
        int[]primos = new int[contador];
        int contador2  = 0;
        for(int x = 1; x < n; x++) {//en el segundo for lo que se hace es agregar los numeros primos
            if(problema5(x)){// menores que n 
                primos[contador2 ] = x;
                contador2 ++;
            }
    }
    return primos;
}


    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }

}

