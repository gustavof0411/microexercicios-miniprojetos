import java.util.Scanner;

public class Questao2 {
    public static double areaCirculo(double raio) {
            final double pi = 3.14159;
            double area = pi*(raio*raio);
            return area;
        }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora do Raio de um Círculo\n");
        System.out.print("Digite aqui o raio do círculo a ser calculado:");
        double raioDigitado = scanner.nextDouble();
        double area = areaCirculo(raioDigitado);
        System.out.println("A área do círculo é " + area);
        scanner.close();
    }
}
