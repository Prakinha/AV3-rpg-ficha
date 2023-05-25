import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mestre> mestres = new ArrayList<Mestre>();
        ArrayList<PlayerCharacter> playerCharacters = new ArrayList<PlayerCharacter>();
        HashMap<Integer,PlayerCharacter> jogadores = new HashMap<>();
        ArrayList<Atributos> atributos = new ArrayList<Atributos>();

        //HashSet<PlayerCharacter> playerCharacters = new HashSet<PlayerCharacter>();
        Scanner s= new Scanner(System.in);


        //objeto peg pega fichas
        PegaAtributo peg = new PegaAtributo();

        //objetos teste
Mestre pedro = new Mestre("pedro","pedro","pedro");
mestres.add(pedro);
        Mestre anacatarina = new Mestre("ana","catarina","anacatarrina");
        mestres.add(anacatarina);
        PlayerCharacter gomes = new PlayerCharacter("pedro","manuel gomes","maura",1234);
        playerCharacters.add(gomes);
        PlayerCharacter andre = new PlayerCharacter("pedro","andre","maura",4321);
        playerCharacters.add(andre);
        Atributos eeee = new Atributos(1234,"maura","manuel gomes","pedro pedradas",200,12,123,31,3,12,3,12,23,2,32,12);
        Atributos eeee1 = new Atributos(1234,"maura","manuel gomes","O a",200,12,123,31,3,12,3,12,23,2,32,12);
        Atributos eeee2 = new Atributos(123,"maura","manuel gomes","sextou",200,12,123,31,3,12,3,12,23,2,32,12);
        atributos.add(eeee);
        atributos.add(eeee2);
        atributos.add(eeee1);

//inicio do codigo
        System.out.println("\nSeja-bem Vindo aos Arquivos, como posso ajudar na sua visita hoje?\n\n");
        System.out.println("Antes de tudo, Mestre Ou Jogador?\nAperte 0 para entrar na tela do Mestre e 1 para a tela do Jogador, caso queira criar seu personagem ou sua campanha digite 2 ou aperte 9 para fechar o sistema\n\n");
        int seletor=0;
        do{
        seletor = s.nextInt();

        //mestre
        if (seletor==0){
            System.out.println("Boas Vindas Mestre, por favor insira o nome da sua campanha\n");


            boolean encontrouMestre = false;
            do {
                String nomCampanha = s.next();
                for (Mestre mestr : mestres) {
                    if (mestr.getCampanha().equals(nomCampanha)) {
                        System.out.println("Bem-vindo(a) " + mestr.getNome() + ", sua visita era esperada");
                        encontrouMestre = true;
                        //resto do codigo para mestre











                        break;
                    }
                }
                if (!encontrouMestre) {
                    System.out.println("Nenhuma campanha foi encontrada com esse nome. Tente novamente escrever a campanha");
                }
            } while (encontrouMestre==false);

            
        }

        //jogador
        else if (seletor==1) {
            //problema de logica, como selecionar apenas jogadores de uma certa campanha? separar campanhas por arquivos?
            System.out.println("Boas Vindas Jogador, por favor insira o nome da sua campanha\n");

            boolean encontrouCampanha = false;
            do {
                String nomCampanha = s.next();
                for (PlayerCharacter player : playerCharacters) {
                    if (player.getCampanha().equals(nomCampanha)) {
                        System.out.println("Por favor, insira o seu codigo de identificacao\n");

                        boolean encontrouPersonagem = false;
                        do {
                            int codPersonagem = s.nextInt();
                            for (PlayerCharacter playe : playerCharacters) {
                                if (playe.getCodJogador() == codPersonagem) {
                                    System.out.println("Bem-vindo(a) " + playe.getNome() + ", sua visita era esperada");
                                    encontrouPersonagem = true;
                                    //resto do codigo para jogador
                                      int sel= 0;
                                    do {
                                        System.out.println("Aperte 0 para rolar um dado\nAperte 1 para criar uma ficha\nAperte 2 para editar uma ficha\nAperte 3 para ver todos os seus personagens\nAperte 9 para cancelar a operacao");
                                        sel= s.nextInt();


                                        //rolar dado
                                        if (sel==0){


                                            ArrayList<Atributos> b = peg.apresentraPersonagens(playe,atributos);
                                            s.nextLine();
                                            String nom =s.nextLine();
                                            System.out.println();
                                            peg.pegaAtributo(b,nom);


                                            int ti=0;
                                            do {
                                                Rolagem r = new Rolagem();
                                                r.quantFaces();

                                                Boolean continua = false;
                                                do {
                                                    continua = false;

                                                    System.out.println("insira o numero de dados a serem rolados");
                                                    int nDados = s.nextInt();
                                                    r.setNumeroDados(nDados);

                                                    r.rolarAtributo(r,peg);
                                                    System.out.println("0-rolar novamente\n1-cancelar operacao");
                                                    int n = s.nextInt();
                                                    if (n == 0) {
                                                        continua = true;
                                                    } else if (n == 1) {
                                                        continua = false;
                                                        break;
                                                    }
                                                } while (continua);

                                            }while(ti!=0);


                                        }


                                        //criar nova ficha
                                        else if (sel==1){
                                            Atributos ficha = new Atributos();
                                            //se eu adicionar ao array list atributos
                                            //se eu so implementar o metodo a ficha vai receber o valor se ficha = ficha.montarPe
                                                atributos.add((Atributos) ficha.montarPersonagem(playe));//wut

                                                System.out.println("ficha cadastrada com sucesso");


                                        }


                                        //editar ficha existente
                                        else if (sel==2){
                                            Atributos ficha = new Atributos();
                                            ficha.montarPersonagem(playe,peg,atributos);



                                            //vai so adicionar outra ficha, como subistituir a ficha?
                                            //atributos.add(ficha);
                                            //eu poderia pegar o index de onde esta a ficha e alocar ela, mas como fazer isso?

                                        }
                                    }while(sel!=9);












                                    break;
                                }
                            }
                            if (!encontrouPersonagem) {
                                System.out.println("Nenhum personagem foi encontrado com esse código. Tente novamente escrever o código");
                            }
                        } while (!encontrouPersonagem);

                        encontrouCampanha = true;
                        break;
                    }
                }
                if (!encontrouCampanha) {
                    System.out.println("Nenhuma campanha foi encontrada com esse nome. Tente novamente escrever a campanha");
                }
            } while (!encontrouCampanha);
        }

        //criar
        else if (seletor==2) {
            System.out.println("aperte 0 para criar um mestre ou aperte 1 para criar um jogador");
            int sel=s.nextInt();
            if (sel==0){
                Mestre mestre=new Mestre();
                boolean temIgual = false;
                String camp=null;
                do{
                    System.out.println("Digite a campanha para criar um mestre");
                        camp = s.next().toLowerCase();

                    for (Mestre mestr:mestres) {
                        if (mestr.getCampanha().equals(camp)){
                            temIgual = true;
                            System.out.println("Já existe um mestre nessa campanha, por favor escolha ou crie outra campanha");
                        }else{
                            temIgual = false;
                        }
                    }
                }while(temIgual);
                try{
                    mestre.setCampanha(camp);
                    s.nextLine();
                    System.out.println("digite o nome do mestre");
                    String nom= s.next();
                    mestre.setNome(nom);
                    s.nextLine();
                    System.out.println("digite a sua senha");
                    String sen= s.next();
                    mestre.setSenha(sen);
                    mestres.add(mestre);

                }catch (InputMismatchException e1){
                    System.out.println("Você digitou o tipo de informação errada.");
                }



            } else if (sel==1) {
                PlayerCharacter player = new PlayerCharacter();
                boolean temIgual = false;
                int cod=0;
                do{
                    System.out.println("Digite um codigo para o jogador");
                    try{
                        cod = s.nextInt();
                    }catch (InputMismatchException e1){
                        System.out.println("Você digitou uma letra onde deveria digitar um numero. Por favor insira um numero");
                    }
                    for (PlayerCharacter Playe:playerCharacters) {
                        if (Playe.getCodJogador()==cod){
                            temIgual = true;
                            System.out.println("Já existe um jogador com esse codigo, escolha outro codigo");
                        }else{
                            temIgual = false;
                        }
                    }
                }while(temIgual);
                try{
                    player.setCodJogador(cod);
                    s.nextLine();
                    System.out.println("digite a campanha que voce participa");
                    boolean encontrouCampanha = false;
                    do {
                        String nomCampanha = s.next().toLowerCase();
                        for (Mestre mestr : mestres) {
                            if (mestr.getCampanha().equals(nomCampanha)) {
                                player.setCampanha(nomCampanha);
                                encontrouCampanha = true;
                                break;
                            }
                        }
                        if (!encontrouCampanha) {
                            System.out.println("Nenhuma campanha foi encontrada com esse nome. Tente novamente escrever a campanha");
                        }
                    } while (encontrouCampanha==false);
                    s.nextLine();
                    System.out.println("digite seu nome");
                    String nom=s.next();
                    player.setNome(nom);
                    System.out.println("digite sua senha");
                    String sen=s.next();
                    player.setSenha(sen);
                    playerCharacters.add(player);
                    System.out.println("cadastro concluido\n\n");


                }catch (InputMismatchException e1){
                    System.out.println("Você digitou o tipo de informação errada.");
                }

            }


        }


            if(seletor==9){break;}
            System.out.println("Aperte 0 para entrar na tela do Mestre\nAperte 1 para a tela do Jogador\nCaso queira criar outro personagem ou campanha digite 2\nAperte 9 para fechar o sistema");
    }while(seletor!=9);
        System.out.println("ate a proxima");
    }
}