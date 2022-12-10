public class Main {
    public static void main(String[] args) {

        int handyCount = 100;
        int replenishment = 1100;

        handyCount = handyCount + replenishment;

        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
            handyCount = handyCount + bonus;
        }
        System.out.println("Вам начислено " + bonus + " рублей");
        System.out.println("На Вашем счету " + handyCount + " рублей");
    }
}