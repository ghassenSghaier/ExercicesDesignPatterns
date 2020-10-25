package tn.iit.ens;


public class Chrono extends AbstractChrono{    

    @Override
    public void tick(int se,int m, int h) {
        for(SonnerieObserver s: sonnerieObservers){
            s.ding(se, m, h);
        }
        for(DisplayObserver d: displayObservers){
            d.display(se, m, h);
        }
    }
}
