package Bloque2;

public class MultiplosRango {
    public static void main(String[] args) {
        int num = 50, multiplos = 0;
        while(num > 0){
            if (num % 7 == 0){
                multiplos++;
            }
            num--;
        }
        System.out.println("El nºtotal de múltiplos exactos de 7 es: " + multiplos);
    }
}
