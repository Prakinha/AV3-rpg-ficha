import java.util.ArrayList;

public class SubistituiAtributos extends Atributos implements AtributosSubistituiMontagem{

    @Override
    public Atributos subistuicao() {
        return null;
    }
    public int indexPorNome(ArrayList<Atributos> atributos, String nome) {
        int i;
        for (i = 0; i < atributos.size(); i++) {
            if (atributos.get(i).getNomePersonagem().equals(nome)) {
                return i;
            }
        }
        return i;
    }

    @Override
    public int acharIndex(PlayerCharacter p, String nom) {
        int index=0;
        for(Atributos atributos: p.personagens){
            if (atributos.getNomePersonagem().equals(nom)){
                index = indexPorNome(p.getPersonagens(),nom);
            }
        }

        return index;
    }
}
