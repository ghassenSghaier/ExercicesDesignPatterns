package iit.ens.tn.chronoexerciceobserverdp;

public class DisplayAguille implements DisplayObserver{

    private int h,m,s;
    public DisplayAguille(Chrono c){
        h = c.getHeures();
        m =c.getMinutes();
        s=c.getSecondes();                
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }
            
    @Override
    public void display(int h, int m, int s) {  
        this.h= h;
        this.m= m;
        this.s= s;
        System.out.println(h+"--"+m+"--"+s);
    }
    
}
