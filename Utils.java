package zooKeeper;

public class Utils extends Mammal{
    private void printEnergyRemain(String act, int energy) {
        System.out.println("The energy after '" + act + "' is " + energy);
    }

    public void activities(String act) {
        int currentEnergy = displayEnergy();
        if(currentEnergy == 0) {
            System.out.println("The animal is dying.........");
        }
        else {
            switch (act.toLowerCase()) {
                case "throw" :
                    if (currentEnergy >= 5) {
                        System.out.println("The gorilla is throwing something");
                        currentEnergy -= 5;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else{
                        System.out.println("The energy is too low to perform " + act);
                    }
                    break;
                case "eat banana" :
                    if (currentEnergy <= 90) {
                        System.out.println("The gorilla is eating banana");
                        currentEnergy += 10;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else{
                        System.out.println("The gorilla is too full to consume");
                    }
                    break;
                case "climb" :
                    if(currentEnergy >= 10) {
                        System.out.println("The gorilla is climbing");
                        currentEnergy -= 10;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else{
                        System.out.println("The energy is too low to perform " + act);
                    }
                    break;
                case "fly" :
                    if(currentEnergy >= 50) {
                        System.out.println("The giant bat is flying");
                        currentEnergy -= 50;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else {
                        System.out.println("The energy is too low to perform " + act);
                    }
                    break;
                case "eat human" :
                    if (currentEnergy <= 275) {
                        System.out.println("The giant bat is eating human");
                        currentEnergy += 25;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else{
                        System.out.println("The giant bat is too full to consume");
                    }
                    break;
                case "attack town" :
                    if(currentEnergy >= 100) {
                        System.out.println("The giant bat is attacking a town");
                        currentEnergy -= 100;
                        printEnergyRemain(act, currentEnergy);
                    }
                    else {
                        System.out.println("The energy is too low to perform " + act);
                    }
                    break;
                default:
                    System.out.println("That is something our animal unable to do");
            }
            if (currentEnergy == 0) {
                System.out.println("It's too late to feed the animal");
            }
        }
        setEnergy(currentEnergy);
    }


}
