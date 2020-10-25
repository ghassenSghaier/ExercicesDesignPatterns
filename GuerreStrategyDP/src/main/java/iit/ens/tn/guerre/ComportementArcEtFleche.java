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
public class ComportementArcEtFleche implements ComportementArme {

    private int nbArcs;

    public ComportementArcEtFleche() {
    }

    public ComportementArcEtFleche(int nbArcs) {
        this.nbArcs = nbArcs;
    }

    @Override
    public void utiliseArme() {
        System.out.println("nb Arcs = " + nbArcs);
        nbArcs--;
    }

    public int getNbArcs() {
        return nbArcs;
    }

    public void setNbArcs(int nbArcs) {
        this.nbArcs = nbArcs;
    }

}
