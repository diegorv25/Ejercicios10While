package Bloque4;

import java.util.Scanner;

public class DetectorAnomalias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0, num;
        boolean negativo = false;
        while (cont<5){
            System.out.println("Introduzca un número entero: ");
            num = sc.nextInt();
            if (num < 0){
                negativo = true;
            }
            cont++;
        }
        if (negativo){
            System.out.println("Entró al menos un número negativo");
        } else {
            System.out.println("No entró ningún número negativo");
        }
    }
}
