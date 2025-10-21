//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma("nazwa firmy");
        Pracownik p1 = new Pracownik("a", "b", "c@a.c", "d", Stanowisko.PREZES);
        Pracownik p2 = new Pracownik("c", "d", "c@a.c", "d", Stanowisko.PREZES);
        Pracownik p3 = new Pracownik("e", "a", "c@a.c", "d", Stanowisko.PREZES);

        firma.dodajPracownika(p1);
        firma.dodajPracownika(p2);
        firma.dodajPracownika(p3);

        firma.grupujAlfabetycznie();
        System.out.println(firma.toString());
    }
}