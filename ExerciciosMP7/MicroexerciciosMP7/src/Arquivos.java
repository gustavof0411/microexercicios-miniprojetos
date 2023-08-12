import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Arquivos {
    private File arquivo;

    public File getArquivo() {
        return this.arquivo;
    }

    // Métodos
    void criadorDeArquivo(String nomeDoArquivo) {
        try {
            this.arquivo = new File("rsc/" + nomeDoArquivo + ".txt");
            if (!arquivo.createNewFile()) {
                System.out.println("O arquivo com nome \"" + nomeDoArquivo + "\" já existe.");
            }
        } catch (Exception e) {
        }
    }

    void gravarTextoEmArquivo(File arquivo, String textoParaAdicionar) {
        try {
            FileWriter gravador = new FileWriter(arquivo);
            gravador.write(textoParaAdicionar);
            gravador.close();
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar o texto.");
        }
    }

    void lerArquivoEExibirConteudo(File arquivoParaLer) {
        try {
            Scanner leitor = new Scanner(arquivoParaLer, "ISO-8859-1");
            while (leitor.hasNextLine()) {
                String algumTexto = leitor.nextLine();
                System.out.println(algumTexto);
            }
            leitor.close();
        } catch (Exception e) {
        }
    }

    public static void gravarObjetosEmArquivo(String nomeDoArquivo, Pessoa pessoa) {
        try {
            FileOutputStream conversor = new FileOutputStream("rsc/" + nomeDoArquivo);
            ObjectOutputStream writer = new ObjectOutputStream(conversor);
            writer.writeObject(pessoa);
            writer.close();
        } catch (Exception e) {
            System.out.println("Não foi possível serializar o objeto.");
        }
    }

    public static void lerObjetosDeArquivo(String nomeDoArquivo) {
        try {
            FileInputStream conversor = new FileInputStream("rsc/" + nomeDoArquivo);
            ObjectInputStream reader = new ObjectInputStream(conversor);
            Pessoa pessoaLida = (Pessoa)reader.readObject();
            reader.close();
            System.out.println(pessoaLida.getNome());
            System.out.println(pessoaLida.getIdade());
        } catch (Exception e) {
            System.out.println("Não foi possível ler o arquivo.");
        }
    }

}
