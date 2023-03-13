package zooKeeper;

public class Gorilla extends Mammal{
    Utils utils = new Utils();

    public void throwThings() {
        utils.activities("throw");
    }

    public void eatBanana() {
        utils.activities("eat banana");
    }

    public void climb() {
        utils.activities("climb");
    }
}
