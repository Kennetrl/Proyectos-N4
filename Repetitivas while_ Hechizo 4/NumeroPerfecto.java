//Kennet Rodriguez
/*Determinar si un número es perfecto.
Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
Por ejemplo, el número 6 es perfecto pues 6=1+2+3
El 6 tiene como divisores: 1, 2, 3 y 6 pero el 6 no se cuenta como divisor para comprobar si es perfecto.*/

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        int num=0;
        boolean numPerfecto;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        //reemplace ... con su código
        num=leer.nextInt();
        numPerfecto=numeroPerfecto(num);
        System.out.println("Numero Perfecto: " + numPerfecto);
        
    }
    
     public static boolean numeroPerfecto(int numero) {
        int i=0, suma=0;
        boolean val=false;
        do{
        i++;
        if(numero%i==0)
        suma+=i;
        } while(i<numero);
        if(suma-numero==numero)
        val=true;
        return val;
    }
        
}
