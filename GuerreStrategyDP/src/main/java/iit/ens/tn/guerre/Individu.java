/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.ens.tn.guerre;

/**
 *
 * @author lenovo
 */
public abstract class Individu {

    ComportementArme cArme;

    public abstract void combattre();

    public abstract void display();

    public void setcArme(ComportementArme cArme) {
        this.cArme = cArme;
    }

    public ComportementArme getcArme() {
        return cArme;
    }

}
