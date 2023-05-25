import java.util.ArrayList;
import java.util.Scanner;

public class PegaAtributo {

    Scanner s =new Scanner(System.in);
    public int sel= 0;
    public int forcNew = 1;
    public int consNew = 1;
    public int tamNew = 1;
    public int dexNew = 1;
    public int appNew = 1;
    public int eduNew = 1;
    public int inteNew = 1;
    public int podNew = 1;
    public int movNew = 1;
    public ArrayList apresentraPersonagens(PlayerCharacter playe,ArrayList<Atributos> atributos){
        ArrayList<Atributos> personagensPessoais = new ArrayList<Atributos>();
        System.out.println("escolha um dos seus personagens abaixo");
        for (Atributos atributos1: atributos){
            if (playe.getCodJogador()==atributos1.getCodJogador()){
                personagensPessoais.add(atributos1);
                System.out.println(atributos1.getNomePersonagem());

            }


        }

return personagensPessoais;
    }

    public void pegaAtributo(ArrayList<Atributos> personagensPessoais,String nom){
        boolean encontrouPersonagem = false;
        int ciclos=0;
        do{
            if(ciclos>0){
                System.out.println("insira novamente o nome do personagem");
             nom =s.nextLine();
            System.out.println();}
            for(Atributos atributos2:personagensPessoais){
                if (atributos2.getNomePersonagem().equals(nom)){
                    forcNew = atributos2.getForc();
                    consNew = atributos2.getCons();
                    tamNew = atributos2.getTam();
                    dexNew = atributos2.getDex();
                    appNew = atributos2.getApp();
                    eduNew = atributos2.getEdu();
                    inteNew = atributos2.getInte();
                    podNew = atributos2.getPod();
                    movNew = atributos2.getMov();
                    encontrouPersonagem = true;
//                    System.out.println("personagem atribuido: "+atributos2.getNomePersonagem());
//                    System.out.println(forcNew);
//                    System.out.println(consNew);
//                    System.out.println(tamNew);
//                    System.out.println(dexNew);
//                    System.out.println(appNew);
//                    System.out.println(eduNew);
//                    System.out.println(inteNew);
//                    System.out.println(podNew);
//                    System.out.println(movNew);
                    break;

                }
                }if(!encontrouPersonagem){
                System.out.println("personagem nao encontrado");
                ciclos++;

            }}while (encontrouPersonagem==false);}


}
