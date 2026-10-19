package Bloque4;

import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        String codigo;
        boolean acierto = false;
        do {
            System.out.println("Introduzca el código: ");
            codigo = sc.nextLine();
            if (codigo.equalsIgnoreCase("1234")){
                acierto = true;
            } else {
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
        } while (intentos>0 && !acierto);
        if (acierto){
            System.out.println("Has ganado el juego");
        } else {
            System.out.println("Has agotado los intentos");
        }
    }
}
