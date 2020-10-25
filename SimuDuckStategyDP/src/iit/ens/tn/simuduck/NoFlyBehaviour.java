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
public class NoFlyBehaviour implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Je peux pas voler");
    }
    
}
