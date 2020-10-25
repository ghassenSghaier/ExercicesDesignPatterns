package iit.ens.tn.adapterdp.test;

public class TestAdapter {

    public static void main(String arg[]) {
        MallardDuck mallard = new MallardDuck();
        WildTurkey wild = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wild);
        test(mallard);
        test(turkeyAdapter);
    }

    static void test(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
