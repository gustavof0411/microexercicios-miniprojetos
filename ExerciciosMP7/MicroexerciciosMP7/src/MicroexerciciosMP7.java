import java.util.Scanner;

public class MicroexerciciosMP7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arquivos arquivo = new Arquivos();
        System.out.print("Digite o nome do arquivo para criar:");
        String nomeDoArquivo = scanner.nextLine();
        arquivo.criadorDeArquivo(nomeDoArquivo);

        System.out.print("Agora, digite o texto que deseja adicionar:");
        String textoParaAdicionar = scanner.nextLine();
        arquivo.gravarTextoEmArquivo(arquivo.getArquivo(), textoParaAdicionar);
        Pessoa pessoa = new Pessoa("Maria", 37);

        nomeDoArquivo = scanner.nextLine();
        Arquivos.gravarObjetosEmArquivo(nomeDoArquivo, pessoa);
        Arquivos.lerObjetosDeArquivo(nomeDoArquivo);
        scanner.close();
    }
}
