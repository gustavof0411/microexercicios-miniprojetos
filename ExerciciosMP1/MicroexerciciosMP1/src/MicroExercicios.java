import java.util.Scanner;

public class MicroExercicios {
    public static void main(String[] args) throws Exception {
        // Exercício 1
        System.out.println("[Exercício 1]");
        System.out.println("Olá, mundo!");
        System.out.println();

        // Exercício 2
        System.out.println("[Exercício 2]");
        int variavel = 10;
        System.out.println("Este é um int " + variavel);
        System.out.println();

        // Exercício 3
        System.out.println("[Exercício 3]");
        boolean varBool = true;
        System.out.println(varBool);
        System.out.println();

        // Exercício 4
        System.out.println("[Exercício 4]");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string aqui:");
        String varStr = scanner.nextLine();
        System.out.println("A variável digitada é " + varStr);
        System.out.println();

        // Exercício 5
        System.out.println("[Exercício 5]");
        System.out.print("Digite uma string aqui:");
        String varStr2 = scanner.nextLine();
        System.out.print("Agora, digite um int aqui:");
        int int2 = scanner.nextInt();
        System.out.println("Você digitou a string " + varStr2 + " e digitou o int " + int2);
        System.out.println();

        // Exercício 6
        System.out.println("[Exercício 6]");
        System.out.println("Todas as variáveis escaneadas até agora foram: " + varStr
                + ", " + varStr2 + ", " + int2);
        System.out.println();

        // Exercício 7
        System.out.println("[Exercício 7]");
        System.out.print("Digite uma variável boolean aqui:");
        boolean bool = scanner.nextBoolean();
        System.out.println();

        // Exercício 8 e 9
        System.out.println("[Exercício 8 e 9]");
        if (bool) {
            System.out.println("É verdade!");
        } else {
            System.out.println("É mentira!");
        }
        System.out.println();

        scanner.close();       
    }
}
