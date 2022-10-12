import java.io.IOException;

public interface Verhalten {
    /**
     *
     * @param orchester
     * @throws IOException
     *
     * Interface um zu entscheiden ob eine Probe oder ein Konzert gespielt werden soll
     */
    void spielen(Orchester orchester) throws IOException;

}
