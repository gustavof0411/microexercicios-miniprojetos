public class MainMP3 {
    public static void main(String[] args) {
        Produto leite = new Produto("Leite", 5.50, 50);

        System.out.println("[VALOR TOTAL DOS PRODUTOS EM ESTOQUE]");
        double precoTotal = leite.valorTotal();
        System.out.println("Há R$" + precoTotal + " em valor em estoque do produto " + leite.getNome());

    }
}
