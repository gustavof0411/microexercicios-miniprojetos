import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcular a média de 3 números inteiros digitados\n");

        System.out.print("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        // Calculando a média
        double media = (num1 + num2 + num3) / 3;

        System.out.println("A média dos três números digitados é " + media);
        scanner.close();
    }
}
