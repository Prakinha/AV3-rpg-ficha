public abstract class Jogador {
    String campanha;
    private String nome;
    private String senha;

    public Jogador(String campanha, String nome, String senha) {
        this.campanha = campanha;
        this.nome = nome;
        this.senha = senha;
    }

    public Jogador() {

    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
