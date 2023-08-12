import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ManipulaProduto implements Serializable {

    public static void criaObjeto(Produto produto) {
        try {
            File arquivo = new File("Questao3MP7/rsc/produtos.txt");
            FileOutputStream conversor = new FileOutputStream(arquivo);
            ObjectOutputStream writer = new ObjectOutputStream(conversor);
            Scanner scanner = new Scanner(arquivo);
            boolean verificaLinha = scanner.hasNextLine();
            if (!verificaLinha) {
            writer.writeObject(produto);
            }
            writer.close();
            scanner.close();
        } catch (Exception e) {
            System.out.println("Não foi possível concluir a operação.");
        }
    }

    public void listaProdutos() {
        try {
            FileInputStream gravador = new FileInputStream("Questao3MP7/rsc/produtos");
            ObjectInputStream reader = new ObjectInputStream(gravador);
            Produto produtoLido = (Produto) reader.readObject();
            produtoLido.getNome();
            reader.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
        }
    }

    public void quantidadeDeProdutos() {
        try {
            FileInputStream gravador = new FileInputStream("rsc/produtos");
            ObjectInputStream reader = new ObjectInputStream(gravador);
            Produto produtoLido = (Produto) reader.readObject();
            double quantidadeTotal = 0;
            quantidadeTotal += produtoLido.getQuantidade();
            reader.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro.");
        }
    }
}
