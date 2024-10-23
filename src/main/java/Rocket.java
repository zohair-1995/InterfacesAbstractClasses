public class Rocket extends Vehicle implements Orbital, Flyable {
    int speed = 0;
    int[] positionXY = new int[2];
    String direction = "Stationary";

    @Override
    public String getDirection() {
        return "";
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void thrust() {
        Orbital.super.thrust();


        @Override
        public void move () {
            System.out.println("Rocket is moving");
        }
        public void setSpeed ( int speed){
            this.speed = speed;
        }
    }
}
