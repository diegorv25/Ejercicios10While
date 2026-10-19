package Bloque5;

import java.util.Scanner;

public class Analizador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, numValidos = -1, suma = 0;
        boolean par = false;
        while (num>=0) {
            numValidos++;
            suma += num;
            System.out.println("Introduzca un número positivo: ");
            num = sc.nextInt();
            if (num % 2 == 0){
                par = true;
            }
        }
        System.out.println("Números válidos introducidos: " + numValidos
                +"\nSuma de números válidos: " + suma);
        if (par){
            System.out.println("Se ha introducido al menos un número par");
        } else {
            System.out.println("No se ha introducido ningún número par");
        }
    }
}
