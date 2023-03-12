package cz.czechitas.ukol3;

import java.rmi.ServerError;
import java.util.Objects;

public class Procesor {

    private String vyrobce;
    private long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        Objects.requireNonNull(vyrobce);
        if (vyrobce.isBlank()) {
            System.err.println("Vyrobce nemuze byt prazdny");
            return;
        }
        this.vyrobce = vyrobce;
    }

    public long getRychlost() {
        return rychlost;
    }

    public void setRychlost(long rychlost) {
        Objects.requireNonNull(rychlost);
        if (rychlost <= 0) {
            System.err.println("Rychlost nemuze byt mensi nez 0");
            return;
         }
        this.rychlost = rychlost;
    }
    public String toString() {
        return "Vyrobce: " + vyrobce + ", Rychlost: " + rychlost;
    }
}