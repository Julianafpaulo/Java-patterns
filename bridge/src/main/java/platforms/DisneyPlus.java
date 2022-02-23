package platforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus(){
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão iniciada ");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: Conta autorizada ");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Canal validado ");

    }
}
