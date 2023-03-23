public class NapojGazowany extends Napoje{

    String mocGazu;

    public NapojGazowany(String nazwa, String mocGazu) {
        super(nazwa);
        this.mocGazu = mocGazu;
    }

    @Override
    public String pij() {
        return "pije napoj gazowany";
    }
}
