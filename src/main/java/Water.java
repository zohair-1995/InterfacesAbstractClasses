public class Water extends Environment<Swimmable>{
    @Override
    public void checkTraffic() {

        for (Object thing : traffic){ //duck, seaplane
            //list is called traffic
            //thing is an item in the list.
            //thing.getClass will return aeroplane, duck, pidgeon etc.
            //System.out.println(thing.getClass().getSimpleName() + " is swimming in the water!!");

            if(thing instanceof Duck){
                ((Duck) thing).swim();
            }
            else if(thing instanceof Seaplane){
                ((Seaplane) thing).swim();
            }


        }

    }
}
