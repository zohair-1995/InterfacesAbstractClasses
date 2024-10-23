public interface Swimmable {
    public default void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
