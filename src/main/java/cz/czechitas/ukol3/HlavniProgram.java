package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Pocitac mujPocitac = new Pocitac();
        System.out.println(mujPocitac.toString());

        mujPocitac.zapniSe();

        Procesor mujProcesor = new Procesor();
        mujProcesor.setRychlost(2_600_000_000L);
        mujProcesor.setVyrobce("Intel");

        Pamet mojePamet = new Pamet();
        mojePamet.setKapacita(12_000_000_000L);

        Disk mujDisk = new Disk();
        mujDisk.setKapacita(200_000_000_000L);
        mujDisk.setVyuziteMisto(55_000_000_000L);

        //Disk mujDisk2 = new Disk ();
        //mujDisk2.setKapacita(1000_000_000_000L);
        //mujDisk2.setVyuziteMisto(0);// prazdny

        mujPocitac.setCpu(mujProcesor);
        mujPocitac.setRam(mojePamet);
        mujPocitac.setPevnyDisk(mujDisk);

        mujPocitac.zapniSe();
        mujPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(mujPocitac.toString());
        mujPocitac.vypniSe();

        mujPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        mujPocitac.vypniSe();      // protoze pocitac je uz vypnuty


       System.out.println(mujPocitac.toString());

       System.out.println(mujPocitac.getCpu());

       mujPocitac.zapniSe();

       mujPocitac.vytvorSouborOVelikosti(55_000_000_000L);
       mujPocitac.vytvorSouborOVelikosti(300_000_000_000L);

       //System.out.println("Program spuštěn.");
    }

}


