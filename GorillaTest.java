package zooKeeper;

public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
//        gorilla.setEnergy(200); // Just for testing proposes

//        Creating these variables in case if number of actions need to be changed
        int t = 3; // <----- Number of throwing times
        int e = 2; // <----- Number of eating banana times
        int c = 1; // <----- Number of climbing times

//        Throwing
        for (int i = 0; i < t; i++) {
            gorilla.throwThings();
        }

//        Eating banana
        for (int i = 0; i < e; i++) {
            gorilla.eatBanana();
        }

//        Climbing
        for (int i = 0; i < c; i++) {
            gorilla.climb();
        }
    }
}
