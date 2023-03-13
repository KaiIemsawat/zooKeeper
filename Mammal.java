package zooKeeper;

public class Mammal {
    private static int energy = 100;

    public static int displayEnergy() {
        System.out.println("The current energy is : " + energy);
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
