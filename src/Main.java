import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.*;

public class Main {
    public static ArrayList<Napoje> napojes = new ArrayList<>();
    public static String napis = "fn";
    public static void main(String[] args) {
        dodawanieElementow();
        metodapij();
        sortowaniePoNazwie();
        sortowaniePoNazwieKlasy();
        zad7();

        //zad8
        Function<String,Integer> dl = (String x) -> x.length();
        System.out.println(dl.apply(napis));

        //zad9
        Consumer<Integer> wynik = (Integer o) -> System.out.println("dostajesz ocene" + o);
        wynik.accept(6);

        //zad10
        BiFunction<Integer,Integer,Integer> iloczyn = (Integer a,Integer b) -> a*b;
        System.out.println(iloczyn.apply(5,5));





    }

    private static void dodawanieElementow()
    {
        napojes.add(new NapojGazowany("cola","mocny"));
        napojes.add(new Woda("zywiec zdroj",null));
        napojes.add(new Sok("tymbark","pomarancza"));
    }

    private static void metodapij()
    {
        for (Napoje napoje : napojes) {
            System.out.println(napoje.pij());
        }
    }

    private static void sortowaniePoNazwie()
    {
        napojes.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return o1.getNazwa().compareTo(o2.getNazwa());
            }
        });

        for (Napoje napoje : napojes) {
            System.out.println(napoje.getNazwa());
        }
    }

    private static void sortowaniePoNazwieKlasy()
    {
        napojes.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
            }
        });
        for (Napoje napoje : napojes) {
            System.out.println(napoje.getNazwa());
        }
    }

    private static void zad7()
    {
        KochajacyProgramowanie kochajacyProgramowanie = new KochajacyProgramowanie() {
            @Override
            public String programuj() {
                return "programuje";
            }
        };
        System.out.println(kochajacyProgramowanie.programuj());
    }

}