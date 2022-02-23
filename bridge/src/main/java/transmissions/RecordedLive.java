package transmissions;

import platforms.IPlatform;

public class RecordedLive extends Live{

    public RecordedLive(IPlatform platform){
        super.platform = platform;
    }

    public void record(){
        System.out.println("Início da gravação da live! ");
    }
}
