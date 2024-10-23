public class Road extends Environment<Carable> {
    int maxSpeed = 70;
    @Override
    public void checkTraffic() {


        for (Object thing : traffic){
            //list is called traffic
            //thing is an item in the list.
            //thing.getClass will return aeroplane, duck, pidgeon etc.
            //System.out.println(thing.getClass().getSimpleName() + " is moving in the road!!");
            if(thing instanceof Aeroplane){
                ((Aeroplane) thing).fly();
            }
            else if(thing instanceof Carable){
                ((Carable) thing).drive();
            }
        }

    }
}
