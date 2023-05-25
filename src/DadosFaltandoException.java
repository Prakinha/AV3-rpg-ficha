public class DadosFaltandoException extends Exception{
    @Override
    public String getMessage() {
        return "Nao foi possivel gravar pois estao faltando dados da ficha";
    }
}
