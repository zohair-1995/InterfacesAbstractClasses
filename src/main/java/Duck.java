public class Duck extends Bird implements Swimmable{
    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
