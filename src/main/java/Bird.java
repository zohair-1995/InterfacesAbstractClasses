public abstract class Bird extends Animal implements Flyable{
    @Override
    public void fly() {
        Flyable.super.fly();
    }
}
