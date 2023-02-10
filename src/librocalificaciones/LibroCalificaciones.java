/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librocalificaciones;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class LibroCalificaciones {

    /**
     * @param args the command line arguments
     */
private final String NombreDelCurso;

public LibroCalificaciones(String nombre){

    NombreDelCurso =nombre;
}
public String ObtenerNombreDelCurso(){

    return NombreDelCurso;
    }

public void MostrarMensaje(){

    System.out.printf("Bienvenido al libro de calificaciones para \n n%s! \n\n", ObtenerNombreDelCurso());
}

public void DeterminarPromedioClase(){

Scanner entrada = new Scanner(System.in);

    int total;
    int contadorCalif;
    int calificacion;
    int promedio;
    total = 1;
    contadorCalif = 1;
    
    while(contadorCalif <=10){
    
        System.out.print("Escriba las calificaciones: ");
            calificacion = entrada.nextInt();
            total = total + calificacion;
            contadorCalif = contadorCalif +1;
           
    }
    
    promedio = total / 10;
    System.out.printf("\n El numero total de las 10 calificaciones es: %d\n", total);
    System.out.printf("El promedio de la clase es: %d\n", promedio);
}

    public static void main(String [] args){
    
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(
                "CS101 Introduccion a la programacion en Java" );
        
    miLibroCalificaciones.MostrarMensaje();
    miLibroCalificaciones.DeterminarPromedioClase();
    }
}