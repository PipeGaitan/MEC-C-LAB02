
package guia2;

import java.util.Scanner;

public class guia22 {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);

        
        String cadena;
        System.out.println("Introduce una frase: ");
        cadena = input.nextLine().toLowerCase();

        char VocalR = 0 ;
        int VocalA = 0;
        int VocalE = 0;
        int VocalI = 0;
        int VocalO = 0;
        int VocalU = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'a':
                    VocalA++;
                    break;
            }
        }
        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'e':
                    VocalE++;
                    break;
            }
        }
        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'i':
                    VocalI++;
                    break;
            }
        }
        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'o':
                    VocalO++;
                    break;
            }
        }
        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'u':
                    VocalU++;
                    break;
            }
        }
        if(VocalA>VocalE && VocalA>VocalI && VocalA>VocalO && VocalA>VocalU) { 
             VocalR = 'a' ; 
            }
        if(VocalE>VocalA && VocalE>VocalI && VocalE>VocalO && VocalE>VocalU) { 
             VocalR = 'e' ; 
            }
        if(VocalI>VocalA && VocalI>VocalE && VocalI>VocalO && VocalI>VocalU) { 
             VocalR = 'i' ; 
            }
        if(VocalO>VocalA && VocalO>VocalE && VocalO>VocalI && VocalO>VocalU) { 
             VocalR = 'o' ; 
            }
        if(VocalU>VocalA && VocalU>VocalE && VocalU>VocalI && VocalU>VocalO) { 
             VocalR = 'u' ; 
            }
        System.out.println(" la letra A se repite " + VocalA + " E se repite" + VocalE + " I se repite " + VocalI + " O se repite " + VocalO + " U se repite"+VocalU);

        for(int j =0;j<letraArray.length;j++){
            int contador = 0;
            for(int k=0;k<letraArray.length;k++){
                if(letraArray[j] == letraArray[k]) 
                    contador++;
            }
            if(contadorLetraRepetida < contador) { 
                contadorLetraRepetida = contador;
                letra = letraArray[j]; 
            }
        }
       cadena = cadena.replace('a',VocalR) .replace('e',VocalR) .replace('i',VocalR).replace('o',VocalR).replace('u',VocalR);
        System.out.println("La Vocal  " + VocalR + " es la que mas se repite de las vocales");
        System.out.println("La letra " + letra + " se repite "+ contadorLetraRepetida + " veces.");
        System.out.println("El Texto Quedaria : "+cadena);
    }
}