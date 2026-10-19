package Bloque3;

public class SumaSucesiva {
    public static void main(String[] args) {
        int num = 0, sumaTotal = 0;
        while(sumaTotal < 100){
            num++;
            sumaTotal += num;
        }
        System.out.println("La suma final obtenida es: " + sumaTotal + " y el último número sumado es " + num);
    }
}
