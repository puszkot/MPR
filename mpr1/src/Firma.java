import java.util.*;


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

    public Map<Stanowisko, List<Pracownik>> grupujPoStanowisku() {
        Map<Stanowisko, List<Pracownik>> mapa = new HashMap<>();

        for (Pracownik p : pracownicy) {
            Stanowisko s = p.getStanowisko();

            if (!mapa.containsKey(s)) {
                mapa.put(s, new ArrayList<>());
            }
            mapa.get(s).add(p);
        }

        return mapa;
    }

    public Map<Stanowisko, Long> liczbaNaStanowisku() {
        Map<Stanowisko, Long> mapa = new HashMap<>();

        for (Pracownik p : pracownicy) {
            Stanowisko s = p.getStanowisko();

            if (!mapa.containsKey(s)) {
                mapa.put(s, 0L);
            }

            mapa.put(s, mapa.get(s) + 1);
        }

        return mapa;
    }

    public double srednieWynagrodzenie() {
        if (pracownicy.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.getWynagrodznie();
        }

        return suma / pracownicy.size();
    }

    public Pracownik najlepiejZarabiajacy() {
        if (pracownicy.isEmpty()) {
            return null;
        }

        Pracownik najlepszy = pracownicy.get(0);
        for (Pracownik p : pracownicy) {
            if (p.getWynagrodznie() > najlepszy.getWynagrodznie()) {
                najlepszy = p;
            }
        }

        return najlepszy;
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
        StringBuilder sb = new StringBuilder("Firma: " + nazwa + "\nPracownicy:\n");
        pracownicy.forEach(p -> sb.append(p).append("\n"));
        return sb.toString();
    }
}
