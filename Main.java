
import java.util.Scanner;
import javaapplication23.Carro;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de carros: ");
        int cantidadCarros = scanner.nextInt();

        Carro[] carros = new Carro[cantidadCarros];

        for (int i = 0; i < cantidadCarros; i++) {
            System.out.println("Carro " + (i + 1));
            System.out.print("Marca: ");
            String marca = scanner.next();
            System.out.print("Modelo: ");
            String modelo = scanner.next();
            System.out.print("Color: ");
            String color = scanner.next();
            System.out.print("Kilometraje: ");
            int kilometraje = scanner.nextInt();

            carros[i] = new Carro(marca, modelo, color, kilometraje);
        }

        
    }
}
