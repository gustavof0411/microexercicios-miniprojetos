import java.lang.Double;

public class Calculadora {

    public Calculadora() {
    }

    // Métodos

    public double soma(double x, double y) {
        double soma = x + y;
        return soma;
    }

    public double subtracao(double x, double y) {
        double subtracao = x - y;
        return subtracao;
    }

    public double multiplicacao(double x, double y) {
        double multiplicacao = x * y;
        return multiplicacao;
    }

    public Double divisao(double x, double y) {
        Double divisao;
        if (y != 0) {
            divisao = x / y;
        } else {
            divisao = null;
        }
        return divisao;
    }
}
