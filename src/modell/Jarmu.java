package modell;

public abstract class Jarmu {
    private boolean beinditva,uzemanyag,megerkezett;

    public Jarmu() {
        
    }

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = false;
        this.uzemanyag = true;
        this.megerkezett = false;
    }
    
    
    public void beindit(){
        boolean siker = true;
    }
    
    public void leallit(){
        boolean siker = false;
    }
    
    public boolean tankol(){
        boolean siker = false;
        return siker;
    }
    
    public boolean halad(){
        boolean siker = false;
        return siker;
    }
}
