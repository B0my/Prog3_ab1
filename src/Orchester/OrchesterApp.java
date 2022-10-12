package Orchester;

import java.io.IOException;

public class OrchesterApp {
    public static void main(String[] args) {

        String audioDatei = "/All_Together.wav";

        Orchester orchester1 = new Orchester("Hogwarts Schulorchester", audioDatei);
        DirigentIn hogwartsDirigent = new DirigentIn("Albus Dumbledor");
        orchester1.setDirigentIn(hogwartsDirigent);

        MusikerIn grangerSaxo = new MusikerIn("Hermine Granger", Instrument.SAXOPHON);
        MusikerIn weaslyDrum = new MusikerIn("Ronald Weasly", Instrument.SCHLAGZEUG);
        MusikerIn potterAcco = new MusikerIn("Harry Potter", Instrument.AKKORDION);

        orchester1.addMusiker(grangerSaxo);
        orchester1.addMusiker(weaslyDrum);
        orchester1.addMusiker(potterAcco);
        try {
            orchester1.proben();
            orchester1.spielen();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}