package Bloque1;

import java.util.Scanner;

public class ConfirmacionUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter;
        do {
            System.out.println("Introduzca un carácter de confirmación");
            caracter = sc.nextLine();
        } while (!caracter.equalsIgnoreCase("s") && !caracter.equalsIgnoreCase("n"));
    }
}
