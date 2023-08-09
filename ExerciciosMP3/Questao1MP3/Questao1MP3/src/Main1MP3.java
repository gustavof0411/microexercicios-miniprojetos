public class Main1MP3 {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", 23);
        Pessoa camila = new Pessoa("Camila", 22);
        Pessoa tiago = new Pessoa("Tiago", 24);
        Pessoa maria = new Pessoa("Maria", 19);

        Pessoa arrayPessoas[] = new Pessoa[4];
        arrayPessoas[0] = joao;
        arrayPessoas[1] = camila;
        arrayPessoas[2] = tiago;
        arrayPessoas[3] = maria;

        for (Pessoa pessoa : arrayPessoas) {
            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos de idade.");
        }
    }
}