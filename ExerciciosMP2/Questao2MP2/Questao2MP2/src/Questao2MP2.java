public class Questao2MP2 {
    public static void main(String[] args) throws Exception {
        Livro livro = new Livro("Java: Como Programar (10ª Edição)",
                "Paul Deitel, Harvey Deitel",
                2016);

        System.out.println("Livro: \"" + livro.titulo + "\"");
        System.out.println("Autores: " + livro.autor);
        System.out.println("Ano de Publicação: " + livro.anoDePublicacao);
    }
}
