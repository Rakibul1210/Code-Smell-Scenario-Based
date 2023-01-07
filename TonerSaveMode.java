import javax.sound.midi.MetaEventListener;

public class TonerSaveMode extends PrintMode{
    String tonerSavingLevel;

    @Override
    public void makeConfiguration() {
        saveToner(tonerSavingLevel);
    }
    public void saveToner(String tonerSavingLevel){
        this.tonerSavingLevel = tonerSavingLevel;
    }
}

class HighTonerSaveMode{

    public int highTonerSaveModeAlgorithm(int colorIntensity){
        return colorIntensity;
    }
}
class MediumTonerSaveMode{
    public int mediumTonerSaveModeAlgorithm(int colorIntensity){
        return colorIntensity;
    }
}
class LowTonerSaveMode{
    public int lowTonerSaveModeAlgorithm(int colorIntensity){
        return colorIntensity;
    }
}