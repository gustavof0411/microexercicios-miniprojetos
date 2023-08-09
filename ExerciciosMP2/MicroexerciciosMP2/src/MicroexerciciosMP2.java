import java.util.Scanner;

public class MicroexerciciosMP2 {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[CALCULADORA]");
        System.out.println("Calculadora de cálculos simples. Note que a ordem a ser escolhida pode influenciar"
                + " no resultado (Ex.: divisão por 0).");
        System.out.print("Digite um número a ser calculado:");
        Double x = scanner.nextDouble();
        System.out.print("Digite um segundo número a ser calculado:");
        Double y = scanner.nextDouble();

        // Cálculos
        Double soma = calculadora.soma(x, y);
        Double subtracao = calculadora.subtracao(x, y);
        Double multiplicacao = calculadora.multiplicacao(x, y);
        Double divisao = calculadora.divisao(x, y);

        // Exibindo os resultados
        System.out.println("A soma de " + x + " + " + y + " é igual a " + soma);
        System.out.println("A subtração de " + x + " - " + y + " é igual a " + subtracao);
        System.out.println("A multiplicação de " + x + " x " + y + " é igual a " + multiplicacao);
        if (divisao != null) {
            System.out.println("A divisão de " + x + " / " + y + " é igual a " + divisao);
        } else {
            System.out.println("Não foi possível realizar a operação de divisão, pois houve divisão por zero.");
        }
        scanner.close();
    }
}
