public class MatrixTests{
  
    public static void scalarProduct_test() {
        
        double[][] t = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] s = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 } };
        Matrix x = new Matrix(t);
        Matrix y = new Matrix(s);
        x.scalarProduct(2);
        if (x.equals(y)) {
            System.out.println("scalar product succesfull ");
        } else {
            System.out.println("scalar product failed ");
        }
    }

    public static void add_test() {
        
        double[][] t = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] s = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] r = { { 2, 4, 6 }, { 8, 10, 12 }, { 14, 16, 18 } };
        Matrix x = new Matrix(t);
        Matrix y = new Matrix(s);
        Matrix z = new Matrix(r);
        x.add(y);
        if (x.equals(z)) {
            System.out.println("addition succesfull ");
        } else {
            System.out.println("addition failed ");
        }
    }

    public static void matrixProduct_test() {
        
        double[][] t = { { 2, 0 }, { 1, 3 } };
        double[][] s = { { -1, -1 }, { 5, 6 } };
        double[][] r = { { -2, -2 }, { 14, 17 } };
        Matrix x = new Matrix(t);
        Matrix y = new Matrix(s);
        Matrix z = new Matrix(r);
        x.matrixProduct(y);
        if (x.equals(z)) {
            System.out.println("matrixProduct succesfull ");
        } else {
            System.out.println("matrixProduct failed ");
        }
    }

    public static void setElement_test() {
         
        double[][] t = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] s = { { 0, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matrix x = new Matrix(t);
        Matrix y = new Matrix(s);
        x.setElement(0, 0, 0);
        if (x.getElement(0, 0) == 0) {
            System.out.println("setElement succesfull ");
        } else {
            System.out.println("setElement failed ");
        }
    }

    public static void getElement_test() {
       
        double[][] t = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matrix x = new Matrix(t);
        if (x.getElement(0, 0) == 1) {
            System.out.println("getElement succesfull ");
        } else {
            System.out.println("getElement failed ");
        }
    }

    public static void determinant_test() {
        
        double[][] t ={{2,0},{-1,3}};
        Matrix x = new Matrix(t);
        x.determinant();
        if (x.determinant ()==6){
            System.out.println("Determinant succesfull");  
        }else{
            System.out.println("Determinant failed");
        } 
    }

    public static void equals_test() {
        
        double[][] t = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        double[][] s = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Matrix x = new Matrix(t);
        Matrix y = new Matrix(s);
        if (x.equals(y) == true) {
            System.out.println("equals succesfull ");
        } else {
            System.out.println("equals failed ");
        }
    }

    public static void main(String[] args) {
        
        scalarProduct_test();
        add_test();
        matrixProduct_test();
        setElement_test();
        getElement_test();
        determinant_test();
        equals_test();
    }
}

