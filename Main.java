import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tamanios = {100, 500, 1000, 5000, 10000};

        for (int n : tamanios) {
            double[] numeros = generarNumerosAleatorios(n);

            // Ordenamiento burbuja
            double[] numerosBurbuja = Arrays.copyOf(numeros, n);
            long tiempoInicioBurbuja = System.nanoTime();
            burbuja(numerosBurbuja);
            long tiempoFinBurbuja = System.nanoTime();
            long tiempoTotalBurbuja = tiempoFinBurbuja - tiempoInicioBurbuja;

            // Ordenamiento inserción
            double[] numerosInsercion = Arrays.copyOf(numeros, n);
            long tiempoInicioInsercion = System.nanoTime();
            insercion(numerosInsercion);
            long tiempoFinInsercion = System.nanoTime();
            long tiempoTotalInsercion = tiempoFinInsercion - tiempoInicioInsercion;

            // Ordenamiento selección
            double[] numerosSeleccion = Arrays.copyOf(numeros, n);
            long tiempoInicioSeleccion = System.nanoTime();
            seleccion(numerosSeleccion);
            long tiempoFinSeleccion = System.nanoTime();
            long tiempoTotalSeleccion = tiempoFinSeleccion - tiempoInicioSeleccion;

            // Ordenamiento mergesort
            double[] numerosMergeSort = Arrays.copyOf(numeros, n);
            long tiempoInicioMergeSort = System.nanoTime();
            mergeSort(numerosMergeSort, 0, numerosMergeSort.length - 1);
            long tiempoFinMergeSort = System.nanoTime();
            long tiempoTotalMergeSort = tiempoFinMergeSort - tiempoInicioMergeSort;

            // Imprimir resultados
            System.out.println("Tamaño del arreglo: " + n);
            System.out.println("Burbuja: " + tiempoTotalBurbuja + " ns");
            System.out.println("Inserción: " + tiempoTotalInsercion + " ns");
            System.out.println("Selección: " + tiempoTotalSeleccion + " ns");
            System.out.println("Mergesort: " + tiempoTotalMergeSort + " ns");
            System.out.println();
        }
    }

    public static double[] generarNumerosAleatorios(int n) {
        double[] numeros = new double[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextDouble();
        }

        return numeros;
    }

    public static void burbuja(double[] numeros) {
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    double temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
    public static void insercion(double[] numeros) {
    int n = numeros.length;

    for (int i = 1; i < n; i++) {
        double actual = numeros[i];
        int j = i - 1;

        while (j >= 0 && numeros[j] > actual) {
            numeros[j + 1] = numeros[j];
            j--;
        }

        numeros[j + 1] = actual;
    }
}
    public static void mergeSort(double[] numeros, int izquierda, int derecha) {
    if (izquierda < derecha) {
        int medio = (izquierda + derecha) / 2;
        mergeSort(numeros, izquierda, medio);
        mergeSort(numeros, medio + 1, derecha);
        merge(numeros, izquierda, medio, derecha);
    }
}

public static void merge(double[] numeros, int izquierda, int medio, int derecha) {
    int n1 = medio - izquierda + 1;
    int n2 = derecha - medio;

    double[] arregloIzquierda = new double[n1];
    double[] arregloDerecha = new double[n2];

    for (int i = 0; i < n1; ++i) {
        arregloIzquierda[i] = numeros[izquierda + i];
    }

    for (int j = 0; j < n2; ++j) {
        arregloDerecha[j] = numeros[medio + 1 + j];
    }

    int i = 0, j = 0;

    int k = izquierda;
    while (i < n1 && j < n2) {
        if (arregloIzquierda[i] <= arregloDerecha[j]) {
            numeros[k] = arregloIzquierda[i];
            i++;
        } else {
            numeros[k] = arregloDerecha[j];
            j++;
        }
        k++;
    }

    while (i < n1) {
        numeros[k] = arregloIzquierda[i];
        i++;
        k++;
    }

    while (j < n2) {
        numeros[k] = arregloDerecha[j];
        j++;
        k++;
    }
}
public static void seleccion(double[] numeros) {
    int n = numeros.length;
    for (int i = 0; i < n - 1; i++) {
        int indiceMenor = i;
        for (int j = i + 1; j < n; j++) {
            if (numeros[j] < numeros[indiceMenor]) {
                indiceMenor = j;
            }
        }
        double temp = numeros[indiceMenor];
        numeros[indiceMenor] = numeros[i];
        numeros[i] = temp;
    }
}
}
