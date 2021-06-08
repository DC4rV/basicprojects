
/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-
9. Após isso determine o maior número da matriz e a sua posição
(linha, coluna).*/
import java.util.Random; //Biblioteca de números aleatórios.
import java.util.Scanner;
//import java.lang.ArrayIndexOutOfBoundsException; //Biblioteca de limite de arrays.

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numerosAleatorios = new int[4][4];
        Random numeroRandom = new Random();
        int Maior = 0;
        int linha = 0;
        int col = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // System.out.println("Digite o numero na posicao[" + i + "] e outro numer na
                // posicao[" + j + "]");
                numerosAleatorios[i][j] = numeroRandom.nextInt(100);// Input para os números aleatórios.
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (numerosAleatorios[i][j] > Maior) {
                    Maior = numerosAleatorios[i][j];
                    linha = i;
                    col = j;
                }
            }
        }
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + Maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + col);
    }

}
