package cz.czechitas.ukol3;

import java.util.Objects;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        //Objects.requireNonNull(cpu);
        //f (
        //cpu.setVyrobce("Intel");
        //cpu.setRychlost(2600000000L);
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }
    public String toString() {
    return "Procesor: " + cpu + ", Pamet: " + ram + ", Disk: " + pevnyDisk;
    }

    public boolean jeZapnuty() {
        if (jeZapnuty == true) {
            return true;
        }
        return false;
    }

    public void zapniSe() {
        if (this.jeZapnuty == true) {
            System.out.println("Pocitac uz byl zapnuty!");
            return;
        }
        jeZapnuty = true;
        System.out.println("Pocitac se zapnul");
        return;
    }
    public void vypniSe() {
        if (this.jeZapnuty == false) {
            System.out.println("Pocitac uz byl vypnuty!");
            return;
        }
        System.out.println("Pocitac se vypnul");
        jeZapnuty = false;
        return;
    }
    public void vytvorSouborOVelikosti(long velikost) {
        if ( ( pevnyDisk.getKapacita() - pevnyDisk.getVyuziteMisto() - velikost ) < 0 ) {
            System.out.println("Nelze vytvorit soubor o velikosti " + velikost + ". Nedostatek mista.");
            return;
        }
        pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
        System.out.println("Soubor o velikosti " + velikost + " vytvoren.");
        return;
    }

    public void vymazSouboryOVelikosti(long velikost) {
        return;
    }
}

