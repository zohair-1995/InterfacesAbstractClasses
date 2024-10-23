public class Car extends Vehicle implements Carable{
    @Override
    public void move() {
        System.out.println("Car is driving.");
    }

    public void drive(){
        System.out.println("Car is driving");
    }
}
