public class MicroexerciciosMP4 {
    public static void main(String[] args) throws Exception {
        ListaDeCompras lista = new ListaDeCompras();

        lista.adicionarItens("Leite");
        lista.adicionarItens("Manteiga");
        lista.adicionarItens("Carne");
        lista.adicionarItens("Alface");

        lista.exibirItens();

        // "Opa! Já tenho leite em casa."
        lista.removerItens("Leite");
        System.out.println();
        lista.exibirItens();
    }
}
