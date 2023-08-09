public class Produto {
    private String nome;
    private double preco;
    private float quantidade;

    public Produto(String nome, double preco, float quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    String getNome() {
        return this.nome;
    }

    double getPreco() {
        return this.preco;
    }

    float getQuantidade() {
        return this.quantidade;
    }

    // Setters
    void setNome(String nome) {
        this.nome = nome;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }

    void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    double valorTotal() {
        return this.preco * this.quantidade;
    }

}
