package Bloque2;

import java.util.Scanner;

public class IntentosAutenticacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin;
        int intentos = 0;
        int contrasena = 1234;
        do {
            System.out.println("Introduzca el PIN numérico");
            pin = sc.nextInt();
            intentos++;
        } while (pin != contrasena);
        System.out.println("Acceso concedido en " + intentos + " intentos");
    }
}
