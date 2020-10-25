/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.ens.tn.chronoexerciceobserverdp;

/**
 *
 * @author lenovo
 */
public class Sonnerie2 implements SonnerieObserver{
     private int h,m,s;
    public Sonnerie2(Chrono c){
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
    public void ding(int h, int m, int s) {
        this.h=h;
        this.m=m;
        this.s=s;
        
        if((m % 30) == 0 && ( s == 0 ) && m!=0)
        {
            System.out.println("Sonne ding ding");
        }
            
    }
    
}   
