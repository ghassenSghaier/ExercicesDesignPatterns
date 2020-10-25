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
public interface Observable {

	void deleteObserver(Observer o);

	void registerObserver(Observer o);

	void notifyObservers();

}
