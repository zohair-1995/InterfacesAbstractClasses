public class Van extends Vehicle implements Carable{
    @Override
    public void move() {
        System.out.println("Van is moving");

    }

    @Override
    public void drive() {
        System.out.println("Van is driving!");
    }
}
