import java.util.Objects;

public class Nachbar {
    private String vorname;
    private String nachname;

    public Nachbar(){
        setVorname("Mr.");
        setNachname("Dummy");
    }

    public Nachbar(String vor, String nach){
        setVorname(vor);
        setNachname(nach);
    }

    public String getNachname() {
        return this.nachname;
    }

    public String getVorname() {
        return this.vorname;
    }

    public void setNachname(String tmp) {
        this.nachname = tmp;
    }

    public void setVorname(String tmp) {
        this.vorname = tmp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nachbar other = (Nachbar) obj;
        return Objects.equals(vorname, other.vorname) && Objects.equals(nachname, other.nachname);
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
}
