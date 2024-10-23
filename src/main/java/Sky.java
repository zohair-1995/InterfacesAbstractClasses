public class Sky extends Environment<Flyable>{
    int maxSpeed = 2000;
    @Override
    public void checkTraffic() {

        for (Object thing : traffic){
            //list is called traffic
            //thing is an item in the list.
            //thing.getClass will return aeroplane, duck, pidgeon etc.
            //System.out.println(thing.getClass().getSimpleName() + " is flying in the sky!!");

            if(thing instanceof Flyable){
                ((Flyable)thing).fly();
            }
        }
    }
}
