package platforms;

public class Twitch implements IPlatform {

    public Twitch() {
        configureRMTP();
        System.out.println("Twitch: Transmissão iniciada ");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: Configurando RMTP ");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: Validando o Canal ");
    }
}