package Nachbar;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        nachbarSpielerei();
    }
    public static void nachbarSpielerei() {
        Nachbar n1 = new Nachbar("Peter", "Parker");
        Nachbar n2 = new Nachbar("Louise", "Lane");
        Nachbar n3 = new Nachbar("Peter", "Parker");
        Nachbar n4 = new Nachbar("Daniel", "Block");
        Nachbar n5 = new Nachbar("Andrea", "Schaab");
        Nachbar n6 = new Nachbar("Katja", "Spät");
        Nachbar n7 = new Nachbar("Vladimir", "Spät");
        Nachbar n8 = new Nachbar("Simon", "Gehling");
        Nachbar n9 = new Nachbar("Simon", "Gehling"); // Duplikat von anderem Objekt mit selbem Namen

        Set<Nachbar> nachbarSet = new HashSet<>();
        nachbarSet.add(n1);
        nachbarSet.add(n2);
        nachbarSet.add(n3);
        nachbarSet.add(n4);
        nachbarSet.add(n5);
        nachbarSet.add(n6);
        nachbarSet.add(n7);
        nachbarSet.add(n8);
        nachbarSet.add(n9);
        nachbarSet.add(n5); // Das gleiche Objekt noch einmal in die Liste einfügen

        System.out.print("Hallo! ");
        String out = nachbarSet.toString();
        out = out.substring(1, out.length() - 1);
        System.out.println(out + '.');
    }
}