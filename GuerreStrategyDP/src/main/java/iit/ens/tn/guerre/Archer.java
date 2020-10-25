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
public class Archer extends Individu {

    public Archer() {
        setcArme(new ComportementArcEtFleche(5));
    }

    @Override
    public void combattre() {
        super.cArme.utiliseArme();
    }

    @Override
    public void display() {
        System.out.println("Archer");
    }

}
