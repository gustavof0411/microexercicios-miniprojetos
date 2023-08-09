import java.util.Scanner;

public class Questao2MP4 {
    public static void main(String[] args) throws Exception {
        // Instâncias
        Scanner scanner = new Scanner(System.in);
        Pessoas pessoas = new Pessoas();

        System.out.println("Adicione nomes de pessoas à uma lista."
                + " Se digitar algo errado por acidente, digite \"remover\" para remover a última adição.");
        System.out.println("Quando quiser finalizar, digite \"interromper\".");

        // Adicionando os nomes no array
        System.out.print("Digite o nome:");
        String nome = scanner.nextLine();
        while (!nome.equalsIgnoreCase("interromper")) {
            if (pessoas.getListaDeNomes().size() != 0 &&
                    nome.equalsIgnoreCase("remover")) {
                System.out.println("[REMOÇÃO - \"" + pessoas.getListaDeNomes().get(
                        pessoas.getListaDeNomes().size() - 1) + "\"]");
                pessoas.removerNome();
            } else if (pessoas.getListaDeNomes().size() == 0 && nome.equalsIgnoreCase("remover")) {
                // Não faz nada. (Essa condição aqui não tem pra que existir)
            } else if (!nome.equalsIgnoreCase("")) {
                pessoas.adicionarNome(nome);
            }
            System.out.print("Digite o nome:");
            nome = scanner.nextLine();
        }

        // Exibindo os nomes da lista
        System.out.println();
        System.out.println("[LISTA DE NOMES]");
        for (String elemento : pessoas.getListaDeNomes()) {

            System.out.println(elemento);
        }
        scanner.close();
    }
}
