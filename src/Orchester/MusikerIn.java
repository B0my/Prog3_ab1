package Orchester;

public class MusikerIn extends Mitglied{

    private Instrument instrument;

    public MusikerIn(String name, Instrument inst) {
        super(name);
        this.instrument = inst;
    }

    public Instrument getInstument(){
        return instrument;
    };
}