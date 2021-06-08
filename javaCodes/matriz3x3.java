
/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/
import java.util.Scanner;

public class Exercicio3Aula20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] valor = new int[3][3];
        int pares = 0;
        int impar = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println("Digite os valores da matriz: Linha= [" + i + "] Coluna= [" + j + "]");
                valor[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(valor[i][j] + "   ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (valor[i][j] % 2 == 0) {

                }
            }
        }
    }
}
