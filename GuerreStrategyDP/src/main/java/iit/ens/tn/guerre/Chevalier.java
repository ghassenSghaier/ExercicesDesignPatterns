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
public class Chevalier extends Individu {

    public Chevalier() {
        setcArme(new ComportementCouteau());
    }

    @Override
    public void combattre() {
        cArme.utiliseArme();
    }

    @Override
    public void display() {
        System.out.println("Chevalier");
    }

}
