import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

        //note I've just commented this part out so we can test the environment.checkVehicles() method on line 58 more easily.
        /*
        for (Object object : objects) {

            if (object instanceof Swimmable swimmable) {
                swimmable.swim();
            }

            if (object instanceof Flyable flyable) {
                flyable.fly();
            }

            if (object instanceof Vehicle vehicle) {
                vehicle.move();
            }

        }

         */

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        //sky.checkTraffic();

        Water water = new Water(); //created a water
        water.addTraffic(new Duck()); //added a duck to water
        water.addTraffic(new Seaplane());

        //water.checkTraffic(); //prints 'Duck is swimming in the water!!'

        Road road = new Road(); //instantiate object.
        road.addTraffic(new Car());
        road.addTraffic(new Lorry());
        road.addTraffic(new Van());
        //road.addTraffic(new Aeroplane()); //weird

        //road.checkTraffic(); //print 'car is moving on the road!!' 'aeroplane is moving... etc.'

        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment: environments) {
            //environment.checkTraffic();
            environment.checkVehicles();
        }




    }
}
