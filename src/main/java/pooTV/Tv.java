package pooTV;

public class Tv {
    private int canal;
    private int volume;
    
    public Tv(){
        this.volume = 0;
        setCanal(56);
    }
    public String toString(){
        return "TV[ volume: "+volume+", canal: "+canal+"]";
    }
    public void setCanal(int canal){
        if((canal > 0) && (canal <= 100))
            this.canal= canal;
    }
    public void aumentarVolume(){
        if(volume < 100)
            this.volume++;
    }
    public void diminuirVolume(){
        if (volume > 0)
            this.volume--;
    }
    
}




