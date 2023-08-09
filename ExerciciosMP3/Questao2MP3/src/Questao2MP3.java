public class Questao2MP3 {
    public static void main(String[] args) throws Exception {
        // Criador contínuo dos objetos
        for (int i = 0; i < 1000000000; i++) {
            ObjetoTeste objeto = new ObjetoTeste();
            if (objeto != null) {
                // Condição para tirar o aviso "objeto não está sendo utilizado" do projeto.
            }
        }
    }
}
