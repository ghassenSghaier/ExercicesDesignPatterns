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
public class MallardDuckSim {

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        WoodenDuck wd = new WoodenDuck();

        //************** Mallard Duck ******************//
        md.performFly();
        md.performQuack();

        //*********************************************//
        //************** Wooden Duck ******************//
        wd.performFly();
        wd.performQuack();

        //*********************************************//
    }

}
