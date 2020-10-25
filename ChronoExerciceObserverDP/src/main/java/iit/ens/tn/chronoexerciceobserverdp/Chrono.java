package iit.ens.tn.chronoexerciceobserverdp;


public class Chrono extends AbstractChrono{    

    @Override
    public void tick(int h,int m, int se) {
        for(SonnerieObserver s: sonnerieObservers){
            s.ding(h, m, se);
        }
        for(DisplayObserver d: displayObservers){
            d.display(h, m, se);
        }
    }
}
