/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioa;

import java.util.ArrayList;
import proiektua_denda.Eskaera;

/**
 *
 * @author Oihane Axpe
 * @version 3.0
 */
public class EskaeraKudeatu {
    private static ArrayList<Eskaera> eskaeraGuzt = new ArrayList<Eskaera>();
    
    /* Eskaera berri bat gehitu/gestionatu */
    public static void eskaeraGehitu() {
        System.out.println("Eskaera berriaren datuak sartu behar dituzu.\n");
        Eskaera eskaera = new Eskaera();
        eskaeraGuzt.add(eskaera);
        System.out.println("\nDatu hauek dituen eskaera gorde da.");
        eskaera.printDatuak();
    }
    
    /* Eskaeren inguruko informazioa erakusten du. */
    public static void eskaeraGuztiakErakutsi() {
        if (eskaeraGuzt.isEmpty()) {
            System.out.println("Ez dago eskaerarik erregistratuta.");
        }
        else {
            System.out.println("ESKAERAK: ");
            System.out.println("\tEskaera zenb\tHornitzailea\tKopurua\tData");
            for (int i = 0; i < eskaeraGuzt.size(); i++) {
                eskaeraGuzt.get(i).printEskaera();
            }
        }
            
    }
    
}

