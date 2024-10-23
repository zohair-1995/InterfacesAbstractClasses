public class Aeroplane extends Vehicle implements Flyable{
    @Override
    public void move() {
        System.out.println("Aeroplane travelling at mach 10");
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }
}
