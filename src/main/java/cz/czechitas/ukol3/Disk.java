package cz.czechitas.ukol3;

import java.util.Objects;

public class Disk {

    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        Objects.requireNonNull(kapacita);
        if (kapacita <= 0) {
            System.err.println("Kapacita nemuze byt mensi nez 0");
            return;
        }
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        Objects.requireNonNull(vyuziteMisto);
        if (vyuziteMisto < 0) {
            System.err.println("VyuziteMisto nesmi byt mensi nez 0");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }
    public  String toString() {
        return kapacita + ", Vyuzite misto:" + vyuziteMisto;
    }
}