public interface Flyable {
    public default void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
