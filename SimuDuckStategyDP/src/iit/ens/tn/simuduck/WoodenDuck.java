/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iit.ens.tn.simuduck;

/**
 *
 * @author lenovo
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        super.qBehaviour = new Squeak();
        super.fBehaviour = new NoFlyBehaviour();
    }

}
