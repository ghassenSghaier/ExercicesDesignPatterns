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
public abstract class Duck {

    protected FlyBehaviour fBehaviour;
    protected QuackBehaviour qBehaviour;

    public void performFly() {
        fBehaviour.fly();
    }

    public void performQuack() {
        qBehaviour.quack();
    }

    public void setfBehaviour(FlyBehaviour fBehaviour) {
        this.fBehaviour = fBehaviour;
    }

    public void setqBehaviour(QuackBehaviour qBehaviour) {
        this.qBehaviour = qBehaviour;
    }

}
