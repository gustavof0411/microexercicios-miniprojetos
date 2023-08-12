import java.io.Serializable;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

public class Questao1MP7 implements Serializable {
    public static void criadorDeArquivo() {
        try {
            File novoArquivo = new File("Questao1MP7/rsc/arquivoQuestao1MP7.txt");
            if (!novoArquivo.createNewFile()) {
                System.out.println("O arquivo já existe.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo.");
        }
    }

    public static void inserirEmArquivo(String textoParaAdicionar) {
        try {
            FileWriter writer = new FileWriter("Questao1MP7/rsc/arquivoQuestao1MP7.txt");
            writer.write(textoParaAdicionar);
            writer.close();
        } catch (Exception e) {
            System.out.println("Nãoi foi possível concluir a operação.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        criadorDeArquivo();
        System.out.print("Digite uma frase para adicionar em um arquivo:");
        String frase = scanner.nextLine();
        inserirEmArquivo(frase);
        /* boolean arquivoFoiCriado = "tempFile".exists() */
        System.out.println("Ótimo! Verifique o seu texto inserido no arquivo"
                + " \"arquivoQuestaoMP7\" na pasta \"Questao1MP7/rsc\".");
        scanner.close();

    }
}
