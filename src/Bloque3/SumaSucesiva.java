package Bloque3;

public class SumaSucesiva {
    public static void main(String[] args) {
        int num = 1, sumaTotal = 0;
        while(sumaTotal <= 100){
            sumaTotal += num;
            num++;
        }
        System.out.println("La suma final obtenida es: " + sumaTotal + " y el último número sumado es " + (num - 1));
        /*
        Otra forma (la mía):

        int num = 0, sumaTotal = 0;
        while(sumaTotal <= 100){
            num++;
            sumaTotal += num;
        }
        System.out.println("La suma final obtenida es: " + sumaTotal + " y el último número sumado es " + num);
        */
    }
}
