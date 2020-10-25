/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.ens;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public abstract class AbstractChrono implements Subject {
    
    protected int heures,minutes,secondes;
    protected List<SonnerieObserver> sonnerieObservers = new ArrayList<>();
    protected List<DisplayObserver> displayObservers = new ArrayList<>();

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }        
    
    @Override
    public void addSonnerieObserver(SonnerieObserver s){
        sonnerieObservers.add(s);
    }
    @Override
    public void removeSonnerieObserver(SonnerieObserver s){
    sonnerieObservers.remove(s);
    }
    @Override
    public void notifySonnerieObservers(){
        for(SonnerieObserver s: sonnerieObservers){
            s.ding(heures, minutes, secondes);
    }        
    }
    @Override
    public void notifyDisplayObservers(){
        for(DisplayObserver d: displayObservers){
           d.display(heures, minutes, secondes);
    }        
}        

    @Override
    public void addDisplayObserver(DisplayObserver s){
        displayObservers.add(s);
    }
    @Override
    public void removeDisplayObserver(DisplayObserver s){
    displayObservers.remove(s);
    }
    
    public abstract void tick(int h,int m, int s);
    
    
}
