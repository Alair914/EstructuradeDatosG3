package mx.edu.Arreglos;

import mx.edu.uttt.poo.Alumno;

import javax.swing.*;

public class AlumnoVector {
    public static void main(String[] args) {
        int tamanio = 0;
        tamanio = obtenerTamanio();
        Alumno alumnos [] = new Alumno[tamanio];

    }

    public static int obtenerTamanio(){
        return Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Introduce el numero de Alumnos a registrar"));
    }

    public static String menu(){
        return "===== MENÚ PRINCIPAL =====\n" +
                "1) Llenar Arreglo\n" +
                "2) Imprimie Arreglo\n" +
                "3) Salir\n" +
                "Elegir Opcion";
    }

    public static void operaciones(Alumno[] alumnos){

        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(menu());

            switch (opcion) {
                case "1":
                    //Llenar Arreglo
                    break;

                case "2":
                    //Imprimir Arreglo
                    break;

                case "3":
                    //Salir
                    JOptionPane.showMessageDialog(null, "Bye");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while (sentinel);
    }

    public static void llenarArreglo(Alumno[] alumnos){
        int i = 0;
        boolean activo = false;
        while (i < alumnos.length){
            Alumno alumno = new Alumno();
            alumno.setNombre(JOptionPane.showInputDialog("Introduce el Nombre del Alumno [ " + i + " ]"));

            alumno.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del Alumno [ " + i + " ]")));
            alumno.setSexo(JOptionPane.showInputDialog("Introduce la edad del Alumno [ " + i + " ]").charAt(0));

            alumno.setActivo(JOptionPane.showInputDialog("Introduce el estatus del Alumno [ " + i + " ] Activo/Inactivo").equalsIgnoreCase("Activo")?true:false);
            alumno.setActivo(activo);
            alumno.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el promedio del Alumno [ \" + i + \" ]\"")));

            alumnos[i] = alumno;
            i++;
        }
    }
}