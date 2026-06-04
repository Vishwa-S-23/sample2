interface Camera {
    void clickPhoto();
}
interface MusicPlayer {
    void playMusic();
}
class Phone implements Camera, MusicPlayer {
    public void clickPhoto() {
        System.out.println("Photo clicked");
    }
    public void playMusic() {
        System.out.println("Music playing");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.clickPhoto();
        p.playMusic();
    }
}