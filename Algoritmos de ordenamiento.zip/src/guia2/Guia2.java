
package guia2;


import java.util.Scanner;
public class Guia2 {

 public static void main(String[] args) {

  
  int T = 0 ;
  float sumatoria = 0;
  float media = 0;
  double varianza = 0.0;
  double desviacion= 0.0; 
   
  Scanner entrada = new Scanner(System.in);
                
  
  System.out .println("Ingrese el valor del arreglo");
  T = entrada.nextInt();
  float valor [] = new float[T];
  
  for (int i = 0; i < T; i++ ){
  
   valor[i] = (float)(Math.random()*101);
   System.out.println("El Valor# " + (i + 1) + ": "+valor[i]);
   sumatoria = sumatoria + valor[i];
    
  }
  entrada.close();
  
  media = sumatoria / T; 
  
  
  for(int i = 0 ; i < T; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
   varianza = varianza + rango;
  }
  varianza = varianza / T;
  desviacion = Math.sqrt(varianza);
  
 
  System.out.println("Media: " + media);
  System.out.println("Varianza: " + varianza);
  System.out.println("Desvianción Estándar: " + desviacion);
 }

}
