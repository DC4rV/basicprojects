import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String linha = scan.nextLine();
        String[] separado = linha.split(" |-|\\.");

        for (int i = 0; i < separado.length; i++) {
            System.out.println(separado[i]);
        }
        scan.close();
    }
}
