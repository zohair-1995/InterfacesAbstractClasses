public interface Carable extends Movable{
    public default void drive(){
        System.out.println("driving!");
    }
}
