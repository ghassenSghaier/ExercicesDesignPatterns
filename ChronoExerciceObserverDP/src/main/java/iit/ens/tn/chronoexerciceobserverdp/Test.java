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
public class Test {
    public static void main(String[] args) {
    Chrono c=new Chrono();
    SonnerieObserver S1=new Sonnerie1(c);
    SonnerieObserver S2=new Sonnerie2(c);
    DisplayObserver D1= new DisplayNumerique(c);
    DisplayObserver D2= new DisplayAguille(c);
    for(int i=1;i<5000;i++)
    { try{Thread.sleep(1000);}
        catch(InterruptedException e) {System.out.print("erreur");}
        c.tick((i%3600)%60, (int)((i%3600)/60), (int)(i/3600)); } }
    
}
