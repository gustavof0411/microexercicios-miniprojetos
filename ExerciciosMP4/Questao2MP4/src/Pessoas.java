import java.util.ArrayList;

public class Pessoas {
    ArrayList<String> listaDeNomes = new ArrayList<>();

    public ArrayList<String> getListaDeNomes() {
        return listaDeNomes;
    }

    void adicionarNome(String nome) {
        getListaDeNomes().add(nome);
    }

    void removerNome() {
        getListaDeNomes().remove(getListaDeNomes().size() - 1);
    }

    void mostrarNomes() {
        for (String elemento : getListaDeNomes()) {
            System.out.println(elemento);
        }
    }
}
