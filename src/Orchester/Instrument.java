package Orchester;

public enum Instrument {
    SAXOPHON("/Baritone.wav"), SCHLAGZEUG("/Drum.wav"), AKKORDION("/Accordion.wav");
    private String audiodatei;

    Instrument(String tmp) {
        this.audiodatei = tmp;
    }

    public String getAudiodatei() {
        return this.audiodatei;
    }

    @Override
    public String toString() {
        switch (this) {
            case SAXOPHON:
                return "Instrument: Saxophon";
            case AKKORDION:
                return "Instrument: Akkordion";
            case SCHLAGZEUG:
                return "Instrument: Schlagzeug";
        }
        return "Ich hab kein Instrument :(";
    }
}