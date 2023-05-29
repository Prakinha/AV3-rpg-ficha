import java.util.ArrayList;


public class PlayerCharacter extends Jogador{
    //a ideia e ter uma classe somente para o jogador para que ele possa alterar os dados apenas do propio personagem, contudo a implementacao de senhas e codigos e secundario para o projeto
    int codJogador;
    public ArrayList<Atributos> personagens;

    public PlayerCharacter(String campanha, String nome, String senha, int codJogador) {
        super(campanha, nome, senha);
        this.codJogador = codJogador;
    }

    public void adicionarPersonagem(Atributos personagem) {
        personagens.add(personagem);}

    public void subistituirPersonagem(Atributos personagem,int index) {
        personagens.set(index,personagem);}

    public PlayerCharacter(int codJogador, ArrayList<Atributos> personagens) {
        this.codJogador = codJogador;
        personagens = personagens;
    }

    public PlayerCharacter(String pedro, String manuelGomes, String maura, int codJogador, ArrayList<PlayerCharacter> personagensPessoais) {

    }

    public PlayerCharacter() {

    }

    public int getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }

    public ArrayList<Atributos> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Atributos> personagens) {
        this.personagens = personagens;
    }
}

