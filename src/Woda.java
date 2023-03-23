public class Woda extends Napoje{

    String smak;

    public Woda(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;
    }

    @Override
    public String pij() {
        return "pije wode";
    }
}
