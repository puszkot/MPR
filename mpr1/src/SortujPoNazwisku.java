import java.util.Comparator;

public class SortujPoNazwisku implements Comparator<Pracownik> {
    @Override
    public int compare(Pracownik p1, Pracownik p2) {
        return p1.getNazwisko().compareTo(p2.getNazwisko());
    }

}
