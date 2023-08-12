import java.util.ArrayList;

public class ConjuntoDeNumeros {
    private ArrayList<String> conjunto = new ArrayList<>(null);

    public ArrayList<String> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<String> conjunto) {
        this.conjunto = conjunto;
    }

    void transformaConjunto(String conjunto) {
        for (int i = 0; i < conjunto.length(); i++) {
            System.out.println(conjunto.charAt(i));
        }

    }

}
