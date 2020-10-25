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
public class MallardDuck extends Duck {

    public MallardDuck() {
        super.fBehaviour = new FlyWithWings();
        super.qBehaviour = new Quack();
    }

}
