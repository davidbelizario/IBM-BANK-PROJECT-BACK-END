package br.com.davidbelizario.ibmbankbackend.authorization;

public record Authorization(
        String message
) {
    public boolean isAuthorized(){
        return message.equals("Autorizado");
    }
}
