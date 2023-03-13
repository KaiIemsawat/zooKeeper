package zooKeeper;

public class BatTest {
    public static void main(String[] args) {
        GiantBat giantBat = new GiantBat();
        giantBat.setEnergy(300);

//        Creating these variables in case if number of actions need to be changed
        int a = 3; // <----- Number of attacking town
        int e = 2; // <----- Number of eating human times
        int f = 1; // <----- Number of flying times

//        Attacking
        for (int i = 0; i < a; i++) {
            giantBat.attackTown();
        }

//        Eating human
        for (int i = 0; i < e; i++) {
            giantBat.eatHuman();
        }

//        Flying
        for (int i = 0; i < f; i++) {
            giantBat.fly();
        }
    }
}
