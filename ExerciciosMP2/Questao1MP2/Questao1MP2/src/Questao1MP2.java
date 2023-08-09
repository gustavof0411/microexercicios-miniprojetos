public class Questao1MP2 {
    public static void main(String[] args) throws Exception {
        Pessoa roberto = new Pessoa();
        roberto.nome = "Roberto";
        roberto.idade = 30;
        roberto.profissao = "arquiteto";

        System.out.println(roberto.nome + ", de " + roberto.idade + " anos, é " + roberto.profissao + ".");
    }
}
