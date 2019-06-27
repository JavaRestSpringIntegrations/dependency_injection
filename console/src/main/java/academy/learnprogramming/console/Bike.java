package academy.learnprogramming.console;

public class Bike implements Vehicle {

    int speed;
    int gear;

    @Override
    public void gearChange(int a) {
        gear = a;
    }

    @Override
    public void speedUp(int a) {
        speed = speed + a;

    }

    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.gearChange(3);
        bike.speedUp(10);
        System.out.println("Bicycle present state :");
        bike.printStates();
    }
}
