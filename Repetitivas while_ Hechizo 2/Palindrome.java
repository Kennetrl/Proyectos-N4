//Kennet Rodriguez
/*Determinar si una palabra o frase es Palíndromo
Palíndrome es palabra o frase que se lee igual de izquierda a derecha, que de derecha a izquierda; p. ej.,
anilina; dabale arroz a la zorra el abad.
Sugerencia: Debe quitar los blancos (“ ”) que existen en la frase y convertir todo a mayúsculas o minúsculas.
Use el método charAt para separar cada caracter del String.*/

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        String texto ="";
        Scanner leer =new Scanner(System.in);
        
        System.out.println("Ingrese el texto: ");
        texto=leer.nextLine();
        System.out.println("Palindromo: " + palindromo(texto));
        
    }
    
      public static boolean palindromo(String cadena){
        int inc = 0;
        //cambio a mayúsculas y quito los blancos
        cadena=cadena.toUpperCase();
        cadena=cadena.replaceAll(" ", "");
        int des = cadena.length()-1;
        boolean res = false;
        //su código aquí
        while (inc <= des){
            if (cadena.charAt(inc)==cadena.charAt(des)) {
            inc++;
            des--;
            res=true;
            } else 
            return false;
      }
            return res;
      }
}