import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Ficha {
//como ficha e atributos sao calculados separadamente pra ocasioes diferentes, eu deixei ficha como a classe mae, principalmente para futuramente adicionar outras classes filhas de outros atributos, por hora, para seguir com o pedido para a av3 vou instanciar atributos ao inves de ficha.

    private int codJogador;
    private String SenhaJogador;
    private String nomeJogador;
    private String nomePersonagem;
    private int idadePersonagem;
    private int hpTotal;
    private int hpAtual;


    public Ficha() {

    }

    private float calcularHp(){
        float hpPercentual = hpAtual/hpTotal;
        return hpPercentual;
    }

    Scanner s = new Scanner(System.in);
    public Ficha montarPersonagem(PlayerCharacter playe){
        Atributos ficha = new Atributos();
        ficha.setCodJogador(playe.getCodJogador());
        ficha.setSenhaJogador(playe.getSenha());
        ficha.setNomeJogador(playe.getNome());
        try {
            System.out.println("insira o nome do seu personagem");
            String nome = s.next();
            ficha.setNomePersonagem(nome);
            s.nextLine();
            System.out.println("insira a idade de " + nome);
            int idade = s.nextInt();
            ficha.setIdadePersonagem(idade);
            System.out.println("insira o hp total");
            int hpT = s.nextInt();
            int hpA = hpT;
            ficha.setHpAtual(hpA);
            ficha.setHpTotal(hpT);

            boolean repete = true;
            do {
                //codigo requer para alguns atributos que eles nao sejam vazios.
                repete = false;
                System.out.println("insira o valor de forca do personagem");
                int forc = s.nextInt();
                ficha.setForc(forc);

                System.out.println("insira o valor de constituicao do personagem");
                int cons = s.nextInt();
                ficha.setCons(cons);

                System.out.println("insira o valor de tamanho do personagem");
                int tam = s.nextInt();
                ficha.setTam(tam);

                System.out.println("insira o valor de destreza do personagem");
                int dex = s.nextInt();
                ficha.setDex(dex);

                System.out.println("insira o valor de aparencia do personagem");
                int app = s.nextInt();
                ficha.setApp(app);

                System.out.println("insira o valor de educacao do personagem");
                int edu = s.nextInt();
                ficha.setEdu(edu);

                System.out.println("insira o valor de intelecto do personagem");
                int inte = s.nextInt();
                ficha.setInte(inte);

                System.out.println("insira o valor de poder do personagem");
                int pod = s.nextInt();
                ficha.setPod(pod);


                if (forc == 0 || cons == 0 || tam == 0 || dex == 0 || app == 0 || edu == 0 || inte == 0 || pod == 0) {
                    repete = true;
                    throw new DadoNuloException();
                }
            } while (repete);
            int mov = ficha.calcularmov();
            ficha.setMov(mov);

        }catch (InputMismatchException e1){
            System.out.println("Você digitou o tipo de informação errada, digite apenas numeros inteiros.");
        }catch (DadoNuloException e){
            e.getMessage();
        }
    return ficha;}

    public Ficha(int codJogador, String senhaJogador, String nomeJogador, String nomePersonagem, int idadePersonagem, int hpTotal, int hpAtual) {
        this.codJogador = codJogador;
        SenhaJogador = senhaJogador;
        this.nomeJogador = nomeJogador;
        this.nomePersonagem = nomePersonagem;
        this.idadePersonagem = idadePersonagem;
        this.hpTotal = hpTotal;
        this.hpAtual = hpAtual;
    }

    public int getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getIdadePersonagem() {
        return idadePersonagem;
    }

    public void setIdadePersonagem(int idadePersonagem) {
        this.idadePersonagem = idadePersonagem;
    }

    public int getHpTotal() {
        return hpTotal;
    }

    public void setHpTotal(int hpTotal) {
        this.hpTotal = hpTotal;
    }

    public int getHpAtual() {
        return hpAtual;
    }

    public void setHpAtual(int hpAtual) {
        this.hpAtual = hpAtual;
    }

    public String getSenhaJogador() {
        return SenhaJogador;
    }

    public void setSenhaJogador(String senhaJogador) {
        SenhaJogador = senhaJogador;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "codJogador=" + codJogador +
                ", SenhaJogador='" + SenhaJogador + '\'' +
                ", nomeJogador='" + nomeJogador + '\'' +
                ", nomePersonagem='" + nomePersonagem + '\'' +
                ", idadePersonagem=" + idadePersonagem +
                ", hpTotal=" + hpTotal +
                ", hpAtual=" + hpAtual +
                '}';
    }
}
