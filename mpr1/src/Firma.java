import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Firma {
    String nazwa;
    List<Pracownik> pracownicy;

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public void grupujAlfabetycznie() {
        pracownicy.sort(new SortujPoNazwisku());
    }

    public Firma(String nazwa) {
        this.nazwa = nazwa;
        this.pracownicy = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(List<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Firma firma = (Firma) o;
        return Objects.equals(pracownicy, firma.pracownicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, pracownicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pracownik pracownik : pracownicy) {
            sb.append(pracownik.toString()).append("\n");
        }

        return "Firma " +
                nazwa + '\n' +
                "Pracownicy:\n" + sb.toString();
    }
}
