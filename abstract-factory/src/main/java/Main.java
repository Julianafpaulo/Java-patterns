import app.Application;
import factory.ITransportFactory;
import factory.NineNineTransport;
import factory.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if(company == "uber"){
            factory = new UberTransport();
        } else{
            factory = new NineNineTransport();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args){
       Application app = configureApplication();
       app.startRoute();

    }


}
