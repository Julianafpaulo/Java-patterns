import transport.CarTransport;
import transport.MotocycleTransport;
import transport.Transport;

public class Main {
    private static Transport transport;

    public static void main(String[] args){
    
        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch(type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotocycleTransport();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}
