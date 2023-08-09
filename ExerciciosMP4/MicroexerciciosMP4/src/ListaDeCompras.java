import java.util.ArrayList;

public class ListaDeCompras {
    private ArrayList<String> lista = new ArrayList<>();

    // Getters
    public ArrayList<String> getLista() {
        return this.lista;
    }

    void adicionarItens(String item) {
        getLista().add(item);
    }

    void removerItens(String remover) {
        getLista().remove(remover);
    }

    void exibirItens() {
        System.out.println("[LISTA DE COMPRAS]");
        for (String item : getLista()) {
            System.out.println(item);
        }
    }
}
