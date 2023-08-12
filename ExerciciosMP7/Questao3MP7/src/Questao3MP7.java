import java.io.Serializable;
import java.util.Scanner;

public class Questao3MP7 implements Serializable {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[LISTADOR DE PRODUTOS]");
        System.out.print("Digite a quantidade de produtos você deseja adicionar:");
        int quantidade = scanner.nextInt();
        for (int i = 1; i <= quantidade; i++) {
            Produto produto = new Produto();
            scanner.nextLine();
            System.out.print("Digite o nome do produto " + i + " (" + i + " de " + quantidade + " produtos):");
            String nomeProduto = scanner.nextLine();
            produto.setNome(nomeProduto);
            System.out.print("Digite a quantidade do produto " + i + " (" + i + " de " + quantidade + " produtos):");
            int quantidadeProduto = scanner.nextInt();
            produto.setQuantidade(quantidadeProduto);
            System.out.print("Digite o preço do produto " + i + " (" + i + " de " + quantidade + " produtos):");
            double precoProduto = scanner.nextDouble();
            produto.setPreco(precoProduto);
            ManipulaProduto.criaObjeto(produto);
        }
        scanner.close();
    }
}
