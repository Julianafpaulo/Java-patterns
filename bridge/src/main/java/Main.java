import platforms.*;
import transmissions.AdvancedLive;
import transmissions.Live;
import transmissions.RecordedLive;

public class Main {


    public static void main(String[] args){
        startLive(new Youtube());
        startAdvancedLive(new Twitch());
        startLive(new Facebook());
        startRecordedLive(new DisneyPlus());

    }

    public static void startLive(IPlatform platform){
        System.out.println("... Aguarde! ");

        Live live = new Live(platform);
        live.broadcasting();
        live.result();

    }

    public static void startAdvancedLive(IPlatform platform){
        System.out.println("... Aguarde transmissão avançada! ");

        AdvancedLive live = new AdvancedLive(platform);
        live.broadcasting();
        live.comments();
        live.subtitles();
        live.result();

    }

    public static void startRecordedLive(IPlatform platform){
        System.out.println("... Aguarde transmissão avançada! ");

        RecordedLive live = new RecordedLive(platform);
        live.broadcasting();
        live.record();
        live.result();

    }
}
