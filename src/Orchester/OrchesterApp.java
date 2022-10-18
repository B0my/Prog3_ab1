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
        MusikerIn womanSaxo = new MusikerIn("Power Woman", Instrument.SAXOPHON);
        MusikerIn dangerDrum = new MusikerIn("Grander Danger", Instrument.SCHLAGZEUG);
        MusikerIn osbornAcco = new MusikerIn("Norman Osborn", Instrument.AKKORDION);

        // Fülle die Leere Liste der Musiker mit neuen Musikern
        orchester1.addMusiker(grangerSaxo);
        orchester1.addMusiker(weaslyDrum);
        orchester1.addMusiker(potterAcco);

        // Adde Duplikate zum Testen für Uniques
        orchester1.addMusiker(grangerSaxo);
        orchester1.addMusiker(weaslyDrum);
        orchester1.addMusiker(potterAcco);

        // Adde Andere Künstler zum kontrollieren der Hash funktion
        orchester1.addMusiker(womanSaxo);
        orchester1.addMusiker(dangerDrum);
        orchester1.addMusiker(osbornAcco);

        // Ausgeben aller Künstler
        for (MusikerIn x : orchester1.getMusikerInnen()
        ) {
            System.out.print(x.toString());
        }

        try {
            // Proben, jeder Musiker spielt einmal
            orchester1.proben();
            orchester1.spielen();

            // Ein Konzert wird gespielt "Alle spielen zusammen"
            orchester1.auftreten();
            orchester1.spielen();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}