/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioa;

import java.util.ArrayList;
import java.util.Iterator;
import proiektua_denda.Hornitzailea;

/**
 *
 * @author Oihane Axpe
 * @version 3.0
 */
public class HornitzaileaKudeatu {
    private static ArrayList<Hornitzailea> hornitzaileGuzt = new ArrayList<Hornitzailea>();
    
    /* Hornitzaile berri bat gehitu */
    public static void hornitzaileaGehitu() {
        System.out.println("Hornitzaile berriaren datuak sartu behar dituzu.");
        Hornitzailea horn1 = new Hornitzailea();         
        hornitzaileGuzt.add(horn1);
        System.out.println("\nDatu hauek dituen hornitzailea gorde da.");
        horn1.printDatuak();
    }
    
    /* Hornitzaile zehatz bat ezabatu */
        public static void hornitzaileaEzabatu(String kodea) {
        Iterator<Hornitzailea> iter = hornitzaileGuzt.iterator();
        while (iter.hasNext()) {
           Hornitzailea horni = iter.next();
            if (horni.getKodHor().equalsIgnoreCase(kodea)) { // konparaketa
                iter.remove(); // ezabatu
            }  
        }
        System.out.println("Hornitzailea ondo ezabatu da.");
    }
    
    /* Hornitzaileen inguruko informazioa erakusten du. */
    public static void hornitzaileGuztiakErakutsi() {
        if (hornitzaileGuzt.isEmpty()) {
            System.out.println("Ez dago hornitzailerik erregistratuta.");
        }
        else {
            System.out.println("HORNITZAILEAK: ");
            System.out.println("\tKodea\tIzena\tHerria\tTelefonoa\tEmail-a");
            for (int i = 0; i < hornitzaileGuzt.size(); i++) {
                hornitzaileGuzt.get(i).printHorn();
            }
        }
    }
}
