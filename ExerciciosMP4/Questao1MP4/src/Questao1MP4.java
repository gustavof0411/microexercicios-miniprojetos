import java.util.Scanner;

public class Questao1MP4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayDeNumeros array = new ArrayDeNumeros();
        System.out.println("Quantos números inteiros você quer adicionar?");
        System.out.print("Digite aqui:");
        int quantidadeNumeros = scanner.nextInt();
        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite o " + i + "º número (" + i + " de " + quantidadeNumeros + "):");
            int numeroAdicionar = scanner.nextInt();
            array.adicionarNumero(numeroAdicionar);
        }

        // Calculando a soma
        int somaTotal = 0;
        for (int elemento : array.getArray()) {
            somaTotal += elemento;
        }

        // Exibindo o resultado
        System.out.println("A soma de todos os números digitados é igual a " + somaTotal);
        scanner.close();

    }
}
