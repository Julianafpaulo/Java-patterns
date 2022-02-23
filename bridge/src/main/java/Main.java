import platforms.Facebook;
import platforms.IPlatform;
import platforms.Twitch;
import platforms.Youtube;
import transmissions.AdvancedLive;
import transmissions.Live;

public class Main {


    public static void main(String[] args){
        startLive(new Youtube());
        startAdvancedLive(new Twitch());
        startLive(new Facebook());

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
}
