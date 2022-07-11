//Kennet Rodriguez
/*Diseñe un algoritmo que lea el valor de un ángulo expresado en grados, lo transforme 
a radianes y calcule (como una serie) el valor del seno de dicho ángulo. 
Se ingresará también el número de términos de la serie:*/

import java.util.Scanner;

public class Seno {

    public static void main(String[] args) {
        //su código aquí
        Scanner leer=new Scanner(System.in);
        double angulo=0, seno=0;
        int num=0;
        System.out.println("Ingrese el valor del angulo en grados: ");
        //reemplace ... con su código
        angulo=leer.nextInt();
        System.out.println("Ingrese el numero de repeticiones de la serie: ");
        //reemplace ... con su código
        num=leer.nextInt();
        seno=seno(angulo,num);
        System.out.println("Seno de " + angulo + " es: " + seno);
        
    }
    
     public static double factorial(int n) {
        //su código aqui
        double resultado=1;
        int i=1;
        while (i<=n) {
            resultado*=i;
            i++;
        }
        return resultado;
    }
    
     /*NO es la mejor forma para calcular sen(x) */
    public static double seno(double grados, int n){
        //debe transformar grados en radianes
        //su código aquí
        double radianes=grados*Math.PI/180;
        double suma=0;
        int potencia=1, signo=1, i=0;
        
        while(i<=n){
            //su código aquí
            suma+=signo*(Math.pow(radianes, potencia)/(factorial(potencia)));
            potencia+=2;
            i+=1;
            signo*=-1;
        }
        return suma;
    }
    
}
