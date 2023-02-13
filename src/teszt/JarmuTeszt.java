package teszt;

import modell.Auto;
import modell.Jarmu;

class Hajo extends Jarmu{}

public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }

    public JarmuTeszt() {
        //mintaSablonTeszt();
        //haladAutoBeinditasNelkul();
        haladAutoBeinditassalTeszt();
        TankolAuto();
        KerekcsereAuto();
        
        haladJarmuBainditassalTeszt();
        
    }

    private void mintaSablonTeszt() {
        int kapott = 7;
        int vart = 3;
        assert kapott == vart : "nem egyenlőek";
    }

    private void haladAutoBeinditasNelkul() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "Beindítás nélkül halad.";
    }

    private void haladJarmuBainditassalTeszt() {
        Hajo hajo = new Hajo();
        hajo.beindit();

        boolean kapott = hajo.halad();
        boolean vart = true;

        assert kapott == vart : "Nem halad";
    }

    private void haladAutoBeinditassalTeszt() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "Autó nem halad!";
    }

    private void TankolAuto() {
        Auto auto = new Auto();
        auto.tankol();
        boolean kapott = auto.tankol();
        boolean vart = false;
        assert kapott == vart : "Autó nem tankol!";
    }

    private void KerekcsereAuto() {
        Auto auto = new Auto();
        auto.kereketCserel();
        boolean kapott = auto.isDefekt();
        boolean vart = false;
        assert kapott == vart : "Autó nem cserél kereket!";
    }
    
    
    
    
    
    
    
}
