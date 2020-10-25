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
public class ArcherGuerre {

    public static void main(String[] args) {

        Chevalier c = new Chevalier();
        Archer a = new Archer();
        Reine r = new Reine();

        if (a.getcArme() instanceof ComportementArcEtFleche) {
            while (((ComportementArcEtFleche) a.getcArme()).getNbArcs() > 0) {
                a.combattre();
            }

        }

        a.setcArme(new ComportementCouteau());
        a.combattre();

    }

}
