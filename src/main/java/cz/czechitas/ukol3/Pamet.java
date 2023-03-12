package cz.czechitas.ukol3;

import java.util.Objects;

public class Pamet {

    private long kapacita;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        Objects.requireNonNull(kapacita);
        if (kapacita <= 0) {
            System.err.println("Kapacita pameti musi byt vetsi nez 0");
            return;
        }
        this.kapacita = kapacita;
    }
    public String toString() {
        return "" + kapacita;
    }
}


