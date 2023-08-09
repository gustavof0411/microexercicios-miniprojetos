import java.util.Scanner;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário os números
        System.out.println("[CALCULADORA]\n");
        System.out.println("Neste programa, serão recebidos dois números inteiros x e y"
                + " para fazer as seguintes operações:");
        System.out.println("Adição: x + y");
        System.out.println("Subtração: x - y");
        System.out.println("Multiplicação: x * y");
        System.out.println("Divisão: x / y");
        System.out.println();
        System.out.println("Observe que, nas operações de subtração e divisão, a ordem importa.\n");
        System.out.print("Digite aqui um número inteiro x:");
        int x = scanner.nextInt();
        System.out.print("Digite aqui um número inteiro y:");
        int y = scanner.nextInt();

        // Fazendo as operações
        // Adição
        int adicao = x + y;

        // Subtração
        int subtracao = x - y;
        int subtracaoOrdemInversa = y - x;

        // Divisão
        int divisao;
        int divisaoOrdemInversa;
        if (y != 0) {
            divisao = x / y;
        } else {
            divisao = null;
        }

        // Multiplicação
        int multiplicacao = x * y;

        // Exibindo os resultados
        System.out.println("A adição de " + Integer.toString(x) + " por " + Integer.toString(y) + " é " + adicao);
        System.out.println("A subtração de " + Integer.toString(x) + " por " + Integer.toString(y) + " é " + subtracao);
        System.out.println("A subtração de " + Integer.toString(y) + " por " + Integer.toString(y) + " é "
                + subtracaoOrdemInversa);
        System.out.println("A divisão de " + Integer.toString(x) + " por " + Integer.toString(y) + " é " + divisao);

        scanner.close();
    }
}
