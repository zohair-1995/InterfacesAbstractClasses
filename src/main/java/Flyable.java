public interface Flyable extends Movable{
    public default void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
