/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.iit.ens;

/**
 *
 * @author lenovo
 */
public interface Subject {
    
    void addSonnerieObserver(SonnerieObserver s);
    void removeSonnerieObserver(SonnerieObserver s);
    void notifySonnerieObservers();
    void addDisplayObserver(DisplayObserver s);
    void removeDisplayObserver(DisplayObserver s);
    void notifyDisplayObservers();
}
