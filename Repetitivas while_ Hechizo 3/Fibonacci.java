//Kennet Rodriguez
/*Calcular la suma de la serie de Fibonacci para un número n de términos de la serie:
Ejemplo: n=5, 1 1  2  3  5 - Suma = 12*/

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        //su código aquí
        int num=0, fibonacci=0, fibo=0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese n, para sumar la serie de fibonacci: ");
        //su código aquí
        num = leer.nextInt();
        
        //reemplace ... con su código
        fibo=fibonacci(num);
        System.out.println("Suma serie fibonacci: " + fibo);
    }
    
    public static int fibonacci(int n){
        //su código aquí
        if(n==0){
            return 1; }
        int i=0, suma=0, b=0, c=1;
        while(i<n) {
        //su código aquí
        int a=b+c;
        b=c; 
        c=a;
        suma+=b;
        i++;
        } 
        return suma;
    }
}
