package modell;

public abstract class Jarmu {
    private boolean beinditva,uzemanyag,megerkezett;

    public Jarmu() {
        
    }

    public Jarmu(boolean beinditva, boolean uzemanyag, boolean megerkezett) {
        this.beinditva = beinditva;
        this.uzemanyag = uzemanyag;
        this.megerkezett = megerkezett;
    }
    
    
    public void beindit(boolean beinditva){
        beinditva = false;
        if(beinditva == true){
           
        }
    }
    
    public void leallit(){
        
    }
    
    public boolean tankol(boolean uzemanyag, boolean beinditva){
        uzemanyag = true;
        beinditva = true;
        if(uzemanyag == false && beinditva == true) {
            return false; 
        }
        return true;
    }
    
    public boolean halad(boolean beinditva){
        beinditva = false; 
        if(beinditva == true){
            return true;
        }
        return false;
    }
}
