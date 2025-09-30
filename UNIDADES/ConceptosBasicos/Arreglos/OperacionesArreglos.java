package mx.edu.Arreglos;


import javax.swing.*;

public class OperacionesArreglos {
    private double [] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos (){
        this.vector = new double [TAMANIO];

    }

    public OperacionesArreglos (int tamanio){
        this.vector = new double [tamanio];

    }

    public OperacionesArreglos (double [] vector){
        this.vector = new double[vector.length];
        this.llenarArreglo(vector);
    }

    public void llenarArreglo (double [] vector){
        int i = 0;
        while (i<this.vector.length){
            this.vector [i] = vector[i];
            i++;
        }

    }
    public void llenarArreglo (){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= Double.parseDouble(JOptionPane.showInputDialog
                    ("Introduce el valor de la posición [" + i + "] "));
        }
    }
    public double sumarValores (){
        double suma = 0;
        for (double v : this.vector) {
            suma+=v;
        }
        JOptionPane.showMessageDialog(null,"la suma de los valores es: " + suma);
        return suma;

    }
    public double obtenerValorMaximo (){
        double maximo = this.vector[0];
        for (double v  : this.vector ){
            if (v>maximo){
                maximo=v;
            }
        }
        return maximo;
    }

    public double obtenerValorMinimo (){
        double minimo = this.vector[0];
        for (double v : this.vector){
            if (v<minimo){
                minimo=v;
            }
        }
        return minimo;
    }

    public boolean compararArreglos (double [] vector){
        boolean isEquals = true;

        if (vector.length != this.vector.length){
            isEquals = false;
        }else{
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if (this.vector[i] != vector[i]){
                    isEquals = false;
                }
            }

        }
        return isEquals;
    }

    public void cambiarTamanio (int tamanio){
        double [] cambiar = new double [tamanio];
        for (int i =0; i < this.vector.length && i<tamanio ; i++) {
            cambiar[i] = this.vector[i];
        }
        this.vector = cambiar;
    }

    public String buscarValor (double valor){
        String posicion = "";
        for (int i = 0; i < vector.length ; i++) {
            if (vector [i] == valor){
                posicion += i + " ";

            }
        }

        if (posicion.equals(" ")){
            JOptionPane.showMessageDialog(null, "El valor " + valor + " no se encontro");
            return "No encontrado";
        }else {
            JOptionPane.showMessageDialog(null, "El valor " + valor + " se encontro en la posición: " + posicion);
            return posicion;
        }
    }

    public void imprimir (){
        String salida1 = "";
        for (double valor : vector){
            salida1 += "| " + valor + " |";
        }
        JOptionPane.showMessageDialog(null, salida1);

        String salida2 = "";
        for (int i = 0; i < vector.length ; i++) {
            salida2 += "| " + vector[i] + " |";
        }
        JOptionPane.showMessageDialog(null, salida2);

        String salida3 = "";
        int i = 0;
        while   (i<vector.length){
            salida3 += "| " + vector[i] + " |";
            i++;
        }

        JOptionPane.showMessageDialog(null,salida3);
    }

}