public class DadoNuloException extends Exception{
    @Override
    public String getMessage() {
        return "o Valor das faces de um dado nao pode ser nulo";
    }
}
