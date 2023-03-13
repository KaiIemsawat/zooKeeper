package zooKeeper;

public class GiantBat extends Mammal{
    Utils utils = new Utils();

    public void fly() {
        utils.activities("fly");
    }

    public void eatHuman() {
        utils.activities("eat human");
    }

    public void attackTown() {
        utils.activities("attack town");
    }
}