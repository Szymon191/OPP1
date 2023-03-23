public class Sok extends Napoje{

    String owoc;

    public Sok(String nazwa, String owoc) {
        super(nazwa);
        this.owoc = owoc;
    }

    @Override
    public String pij() {
        return "pije sok";
    }
}
