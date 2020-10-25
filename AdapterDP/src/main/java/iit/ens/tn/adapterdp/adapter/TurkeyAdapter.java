package iit.ens.tn.adapterdp.adapter;
import iit.ens.tn.adapterdp.core.*;

class TurkeyAdapter implements Duck {

    Turkey turkey;

    TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    public void quack() {
        turkey.gobble();
    }
    public void fly() {
        for(int i=0;i<5;i++)
        turkey.fly();
    }
}


