

import java.util.Scanner;

public class ejerci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int filas = 2;
        int columnas = 2;

        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        // Llenar matriz A
        System.out.println("Ingrese los valores de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextInt();
            }
        }

        // Llenar matriz B
        System.out.println("\nIngrese los valores de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextInt();
            }
        }

        // SUMA
        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // RESTA
        int[][] resta = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resta[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        // MULTIPLICACIÓN
        int[][] multiplicacion = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                multiplicacion[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    multiplicacion[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Mostrar resultados
        System.out.println("\nMatriz Suma:");
        imprimirMatriz(suma);

        System.out.println("\nMatriz Resta:");
        imprimirMatriz(resta);

        System.out.println("\nMatriz Multiplicación:");
        imprimirMatriz(multiplicacion);

        sc.close();
    }

    // Método para imprimir matrices
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}