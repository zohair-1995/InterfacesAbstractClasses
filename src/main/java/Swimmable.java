public interface Swimmable extends Movable{
    public default void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
