import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("Techcorp");
        Pracownik p1 = new Pracownik("Jan", "Kowalski", "jan@a.com", "TechCorp", Stanowisko.MANAGER);
        Pracownik p2 = new Pracownik("Anna", "Nowak", "anna@a.com", "TechCorp", Stanowisko.PROGRAMISTA);
        Pracownik p3 = new Pracownik("Piotr", "Adamski", "piotr@a.com", "TechCorp", Stanowisko.STAZYSTA);
        Pracownik p4 = new Pracownik("Katarzyna", "Zielińska", "katarzyna@a.com", "TechCorp", Stanowisko.PREZES);

        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);
        firma.dodajPracownika(p3);
        firma.dodajPracownika(p4);

        firma.grupujAlfabetycznie();
        for (Pracownik p : firma.getPracownicy()) {
            System.out.println(p);
        }
        System.out.println('\n');

        Map<Stanowisko, List<Pracownik>> grupy = firma.grupujPoStanowisku();
        for (Stanowisko s : grupy.keySet()) {
            System.out.println(s + ": " + grupy.get(s));
        }
        System.out.println('\n');

        Map<Stanowisko, Long> liczby = firma.liczbaNaStanowisku();
        for (Stanowisko s : liczby.keySet()) {
            System.out.println(s + ": " + liczby.get(s));
        }
        System.out.println('\n');

        System.out.println(firma.srednieWynagrodzenie());
        System.out.println('\n');

        Pracownik najlepiejZarabiajacy = firma.najlepiejZarabiajacy();
        System.out.println(najlepiejZarabiajacy);
    }
}