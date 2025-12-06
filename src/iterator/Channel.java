package iterator;

public class Channel {

    private double frequency;
    private ChannelType TYPE;

    public Channel(double freq, ChannelType type){
        this.frequency = freq;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Frecuencia=" + this.frequency + ", Tipo=" + this.TYPE;
    }
}
