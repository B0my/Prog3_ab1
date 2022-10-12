
public enum Instrument {SAXOPHON("/Baritone.wav"), SCHLAGZEUG("/Drum.wav"), AKKORDION("Accordion.wav");

    private String audiodatei;
    Instrument(String tmp){
        this.audiodatei = tmp;
    }

    public String getAudiodatei(){
        return this.audiodatei;
    }
}