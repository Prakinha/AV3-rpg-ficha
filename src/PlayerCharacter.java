public class PlayerCharacter extends Jogador{
    //a ideia e ter uma classe somente para o jogador para que ele possa alterar os dados apenas do propio personagem, contudo a implementacao de senhas e codigos e secundario para o projeto
    int codJogador;

    public PlayerCharacter(String campanha, String nome, String senha, int codJogador) {
        super(campanha, nome, senha);
        this.codJogador = codJogador;
    }

    public PlayerCharacter() {

    }

    public int getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }
}

