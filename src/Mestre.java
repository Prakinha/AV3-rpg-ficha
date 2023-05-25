public class Mestre extends Jogador{

    //a classe do mestre poderia contar com um codigo e senha, assim o mestre poderia editar todos os personagens com o codigo
    //a primeira pergunta sobre edicao e agregacao de informacao sobre os personagens deve ser sobre se o jogador e mestre e pedir um codigo para acessar as informacoes
    public Mestre(String campanha, String nome, String senha) {
        super(campanha,nome,senha);
    }

    public Mestre() {
        super();
    }
}
