//Kennet Rodriguez
/*Calcular el factorial de un número. (Utilice la estructura while )
N!=N*(N-1)*(N-2)*...*(N-(N-1))*/

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        double fact=0.0, factorial=0.0;
        int num=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero para obtener el factorial: ");
        num = leer.nextInt();
        
        fact=factorial(num);
        System.out.println("El factorial es: " + fact);
    }
    
     public static double factorial(int n) {
        double resultado = 1;
       int i=2; 
        while (i <= n) {
            resultado*=i;
            i++;
        }
        return resultado;
    }
}
