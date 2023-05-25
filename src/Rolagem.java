import java.util.Random;

public class Rolagem extends Dado{
    //fazer um log de cada rolagem pra cada jogador a ser consultado depois??


    public Rolagem(int faces) {
        super(faces);
    }

    public Rolagem() {
        super();
    }


    public String qualidadeDado(int att, int roll){
        Random rand = new Random();
        String qualidade=null;
    //int roll= rand.nextInt(getFaces())+1;
        //System.out.println("O valor do dado foi: "+roll);
        System.out.println("Valor do atributo: "+att);
        if (roll==1&&att!=20){
            qualidade="Falha Critica";
        }else if ((att/20)+roll>20&&att>=20){
            qualidade= "Divino";
        }else if ((att/5)+roll>20){
            qualidade= "Extremo";
        }else if ((att/2)+roll>20){
            qualidade= "Sucesso Bom";
        }else if (att+roll>20){
            qualidade= "Sucesso Normal";
        }else if ((att)+roll<20){
            qualidade= "Fracasso";
        }
        System.out.println(qualidade);
        return qualidade;
}
public void rolarAtributo(Rolagem r,PegaAtributo peg){
    System.out.println("0-apenas rolar o dado\n1-forca\n2-constituicao\n3-tamanho\n4-destreza\n5-aparencia\n6-educacao\n7-inteligencia\n8-poder\n9-cancelar operacao");
    int tD = s.nextInt();
    switch (tD) {
        case 0:
            r.rolarVantagem();
            break;
        case 1:
            r.qualidadeDado(peg.forcNew, r.rolarVantagem());
            break;
        case 2:
            r.qualidadeDado(peg.consNew, r.rolarVantagem());
            break;
        case 3:
            r.qualidadeDado(peg.tamNew, r.rolarVantagem());
            break;
        case 4:
            r.qualidadeDado(peg.dexNew, r.rolarVantagem());
            break;
        case 5:
            r.qualidadeDado(peg.appNew, r.rolarVantagem());
            break;
        case 6:
            r.qualidadeDado(peg.eduNew, r.rolarVantagem());
            break;
        case 7:
            r.qualidadeDado(peg.inteNew, r.rolarVantagem());
            break;
        case 8:
            r.qualidadeDado(peg.podNew, r.rolarVantagem());
            break;
    }



}

}
