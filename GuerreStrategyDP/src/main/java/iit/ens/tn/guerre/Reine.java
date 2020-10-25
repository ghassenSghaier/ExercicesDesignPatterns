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
public class Reine extends Individu {

    @Override
    public void combattre() {
        setcArme(new ComportementEpee());
    }

    @Override
    public void display() {
        System.out.println("Reine");
    }

}
