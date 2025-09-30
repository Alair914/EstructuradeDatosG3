package mx.edu.Arreglos;

public class TestOperacionesArreglos {
    private double[] vector;

    public static void main(String[] args) {
        double[] vector;

        // Inicialización correcta del arreglo
        vector = new double[]{1.2, 4.5, 7.8};

        // Uso del arreglo inicializado
        OperacionesArreglos op1 = new OperacionesArreglos(vector);
        OperacionesArreglos op2 = new OperacionesArreglos(6);
        OperacionesArreglos op3 = new OperacionesArreglos(vector);
    }

    public void llenarArreglo (double[] vector){
        int i=0;
        while (i<this.vector.length){
            this.vector[i] = vector[i];
            i++;
        }
        
    }
}
