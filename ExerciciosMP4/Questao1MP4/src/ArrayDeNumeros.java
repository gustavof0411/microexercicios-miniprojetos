import java.util.ArrayList;

public class ArrayDeNumeros {
    private ArrayList<Integer> array = new ArrayList<>();

    public ArrayList<Integer> getArray() {
        return array;
    }
    public void setArray(ArrayList<Integer> array) {
        this.array = array;
    }
    public void adicionarNumero(int elemento) {
        getArray().add(elemento);
    }
    
}
