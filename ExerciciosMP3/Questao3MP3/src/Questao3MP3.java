public class Questao3MP3 {
    public static void main(String[] args) throws Exception {
        Funcionario guilherme = new Funcionario("Guilherme", 26, 3500);
        Funcionario carla = new Funcionario("Carla", 27, 3500);

        System.out.println("Funcionário(a): " + guilherme.getNome());
        System.out.println("Idade: " + guilherme.getIdade() + " anos");
        System.out.println("Salário: R$" + guilherme.getSalario());

        System.out.println();

        System.out.println("Funcionário(a): " + carla.getNome());
        System.out.println("Idade: " + carla.getIdade() + " anos");
        System.out.println("Salário: R$" + carla.getSalario());
    }
}
