import app.Application;
import factory.BoatTransport;
import factory.ITransportFactory;
import factory.NineNineTransport;
import factory.UberTransport;

public class Main {

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "boat";

        if(company == "uber"){
            factory = new UberTransport();
        } else if(company == "99"){
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args){
       Application app = configureApplication();
       app.startRoute();

    }


}
