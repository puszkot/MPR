import java.util.Objects;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private String email;
    private String nazwaFirmy;
    private Stanowisko stanowisko;
    private double wynagrodznie;

    public Pracownik(String imie, String nazwisko, String email, String nazwaFirmy, Stanowisko stanowisko) {
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Błędny email!");
        } else {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.email = email;
            this.nazwaFirmy = nazwaFirmy;
            this.stanowisko = stanowisko;
            this.wynagrodznie = stanowisko.getWynagrodznie();
        }
    }

    public boolean validateEmail(String email) {
        if (Objects.isNull(email)) {
            return false;
        }
        return email.contains("@") && email.contains(".");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getWynagrodznie() {
        return wynagrodznie;
    }

    public void setWynagrodznie(double wynagrodznie) {
        this.wynagrodznie = stanowisko.getWynagrodznie();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pracownik)) return false;
        Pracownik that = (Pracownik) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                ", nazwaFirmy='" + nazwaFirmy + '\'' +
                ", stanowisko=" + stanowisko +
                ", wynagrodznie=" + wynagrodznie +
                '}';
    }
}
