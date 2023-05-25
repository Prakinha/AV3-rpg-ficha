import java.util.Random;
import java.util.Scanner;

public abstract class Dado {
    //como o dado representa um mecanismo de decisao, ele vira abstrato pois eu nao quero que seja capaz de instanciar um dado
   //algumas implementacoes de dado como vantagens desvantagens, melhor resultado sao secundario e talvez nao sejam apresentados na av3
    private int faces;
    private int numeroDados;


    public Dado() {

    }

    public int rolarVantagem() {
        int[] vantagens = new int[numeroDados];
        Random aleatorio = new Random();
        int maior = 0;

        for (int i = 0; i < numeroDados; i++) {
            vantagens[i] = aleatorio.nextInt(faces) + 1;

            if (vantagens[i] > maior) {
                maior = vantagens[i];
            }
        }
        System.out.println("O valor do dado foi:"+maior);

        return maior;
    }

    Scanner s =new Scanner(System.in);

    public int quantFaces(){
        System.out.println("0- 2 lados\n1- 4 lados\n2- 6 lados\n3- 8 lados\n4- 10 lados\n5- 12 lados\n6- 20 lados\n7- 100 lados\n");
        int nl = s.nextInt();
        s.nextLine();

        switch (nl) {
            case 0:
                this.faces = 2;
                break;
            case 1:
                this.faces = 4;
                break;
            case 2:
                this.faces = 6;
                break;
            case 3:
                this.faces = 8;
                break;
            case 4:
                this.faces = 10;
                break;
            case 5:
                this.faces = 12;
                break;
            case 6:
                this.faces = 20;
                break;
            case 7:
                this.faces = 100;
                break;
    }
    return faces;}

    public Dado(int faces) {
        this.faces = faces;
    }

    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    public int getNumeroDados() {
        return numeroDados;
    }

    public void setNumeroDados(int numeroDados) {
        this.numeroDados = numeroDados;
    }
}
