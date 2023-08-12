import java.util.Scanner;
import java.io.File;

public class Questao2MP7 {
    public static void lerArquivo() {
        try {
            // Nota: se o arquivo for executado em um outro computador,
            // certifique-se de adequar o caminho absoluto.
            Scanner scanner = new Scanner(new File(
                    "C:/Users/Usuário/Documents/Projetos Java/ExerciciosJava/ExerciciosMP7/Questao1MP7/rsc/arquivoQuestao1MP7.txt"));
            while (scanner.hasNextLine()) {
                String algumTexto = scanner.nextLine();
                System.out.println(algumTexto);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Não foi possível ler o arquivo. Verifique se executou o programa \"Questao1MP7\""
                    + " e, se isso está sendo executando em outro computador, verifique o caminho absoluto no código.");
        }
    }

    public static void main(String[] args) throws Exception {
        // Obs.: para executar esta questão, certifique-se de executar
        // o programa "Questao1MP7" primeiro.

        System.out.println("O texto que você digitou no programa anterior foi:");
        lerArquivo();
    }
}
