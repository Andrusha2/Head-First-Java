package Chapter2;

public class DrumKitTestDrive {
    public static void main(String[] args){
        DrumKit d = new DrumKit();
        d.playsnare();
        d.snare = false;
        if (d.snare) {
            d.playsnare();
        }
        d.playtopHat();
    }
}
