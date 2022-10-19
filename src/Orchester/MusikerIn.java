package Orchester;

import java.util.Objects;

public class MusikerIn extends Mitglied{

    private Instrument instrument;
    private int hash;

    public MusikerIn(String name, Instrument inst) {
        super(name);
        this.instrument = inst;
    }

    public Instrument getInstument(){
        return instrument;
    };


    public int getHash() {
        return this.hash;
    }

    @Override
    public int hashCode() {
        this.hash = Objects.hash(this.getInstument(), this.getName());
        return this.hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MusikerIn other = (MusikerIn) obj;
        return Objects.equals(this.getHash(), other.getHash());
    }

    @Override
    public String toString() {
        return "Hallo ich bin " + this.getName() + " " + this.getInstument().toString() + " \n";
    }
}