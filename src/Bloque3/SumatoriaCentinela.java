package Bloque3;

import java.util.Scanner;

public class SumatoriaCentinela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, sumaTotal=0;
        do {
            System.out.println("Introduzca un número entero");
            numero = sc.nextInt();
            sumaTotal+=numero;
        } while (numero != 0);
        System.out.println("La suma total de los valores ingresados es " + sumaTotal);
    }
}
