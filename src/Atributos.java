import java.util.ArrayList;
import java.util.InputMismatchException;

public class Atributos extends Ficha{
    //Atributos sao apenas uma das classes que extende ficha, por questoes de tempo os outros atributos nao serao como vida, sanidade ou pericias nao estarao no projeto da av3
    int forc;
    int cons;
    int tam;
    int dex;
    int app;
    int edu;
    int inte;
    int pod;
    int mov;

    public Atributos() {
        super();
    }
    public Ficha montarPersonagem(PlayerCharacter playe, PegaAtributo peg, ArrayList<Atributos> atributos){
        Atributos ficha = new Atributos();
        boolean repete = true;
        try{
            //pega os personagens do jogador playe
            ArrayList<Atributos> personagensPessoais = peg.apresentraPersonagens(playe,atributos);
            //peg.apresentraPersonagens(playe,atributos);
            do {
            //scanner para achar os personagens que saem do array personagensPessoais do apresentaPersonagens
            String nom =s.nextLine();
                System.out.println(nom);
            System.out.println();

            //encontra o personagem para ter seus atributos mudados
            for(Atributos atributos2:personagensPessoais) {
                if (atributos2.getNomePersonagem().equals(nom)) {
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

                }
            }




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

    public int calcularmov(){
        if (dex+forc<tam){
            mov=7;
        }else if (dex+forc>=tam) {
            if (dex>=tam&&forc>tam) {
                mov = 9;
            }else {mov=8;}

        }return mov;
    }

    public Atributos(int codJogador, String senhaJogador, String nomeJogador, String nomePersonagem, int idadePersonagem, int hpTotal, int hpAtual, int forc, int cons, int tam, int dex, int app, int edu, int inte, int pod, int mov) {
        super(codJogador, senhaJogador, nomeJogador, nomePersonagem, idadePersonagem, hpTotal, hpAtual);
        this.forc = forc;
        this.cons = cons;
        this.tam = tam;
        this.dex = dex;
        this.app = app;
        this.edu = edu;
        this.inte = inte;
        this.pod = pod;
        this.mov = mov;
    }

    public int getForc() {
        return forc;
    }

    public void setForc(int forc) {
        this.forc = forc;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getApp() {
        return app;
    }

    public void setApp(int app) {
        this.app = app;
    }

    public int getEdu() {
        return edu;
    }

    public void setEdu(int edu) {
        this.edu = edu;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getPod() {
        return pod;
    }

    public void setPod(int pod) {
        this.pod = pod;
    }

    public int getMov() {
        return mov;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "codJogador=" + getCodJogador() +
                ", SenhaJogador='" + getSenhaJogador() + '\'' +
                ", nomeJogador='" + getNomeJogador() + '\'' +
                ", nomePersonagem='" + getNomePersonagem() + '\'' +
                ", idadePersonagem=" + getIdadePersonagem() +
                ", hpTotal=" + getHpTotal() +
                ", hpAtual=" + getHpAtual() +
                '}'+
                "Atributos{" +
                "forc=" + forc +
                ", cons=" + cons +
                ", tam=" + tam +
                ", dex=" + dex +
                ", app=" + app +
                ", edu=" + edu +
                ", inte=" + inte +
                ", pod=" + pod +
                ", mov=" + mov +
                '}';
    }
}
