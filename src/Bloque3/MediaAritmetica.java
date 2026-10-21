package Bloque3;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        double calificacion = 0, sumaTotal=0, media;
        double parada = -1;
        while (calificacion != -1) {
            System.out.println("Introduzca una calificación decimal");
            calificacion = sc.nextDouble();
            if (calificacion != parada){
                sumaTotal+=calificacion;
                cantidad++;
            }
        }
        media=sumaTotal/cantidad;
        System.out.println("La media aritmética de los valores ingresados es " + media);
        /*
        Otra forma (la mía):

        Scanner sc = new Scanner(System.in);
        int cantidad = -1;
        double calificacion = 0, sumaTotal=0, media;
        while (calificacion != -1) {
            sumaTotal+=calificacion;
            System.out.println("Introduzca una calificación decimal");
            calificacion = sc.nextDouble();
            cantidad++;
        }
        media=sumaTotal/cantidad;
        System.out.println("La media aritmética de los valores ingresados es " + media);
        */
    }
}
