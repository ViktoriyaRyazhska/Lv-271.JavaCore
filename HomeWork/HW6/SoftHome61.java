package HW6;

abstract class Bird{
    public abstract void fly();
}

class FlyingBird extends Bird{
    public String feathers="Not many";
    public String layEggs="Yes";
    public String Bones="Rough";
    public String keel="Big";


    public void fly(){
        System.out.println("Ця птаха літає");
    }
}

class NonFlyingBird extends Bird{
    public String feathers="Many";
    public String layEggs="Yes";
    public String Bones="Thin";
    public String keel="Small";

    public void fly(){
        System.out.println("Ця птаха не літає");
    }
}

class Eagle extends FlyingBird{
    public String nameBird="Eagle";
}

class Swallow extends FlyingBird{
    public String nameBird="Swallow";
}

class Penguin extends NonFlyingBird{
    public String nameBird="Penguin";

    }

class Chicken extends NonFlyingBird {
    public String nameBird="Chicken";
}


class SoftHome61 {
    public static void main(String[] args) {

        Bird[] bird={new Eagle(),new Swallow(),new Penguin(),new Chicken()};

        for (int i = 0; i < bird.length; i++) {
            bird[i].fly();
        }

        Eagle eg = new Eagle();
        System.out.println("Name "+eg.nameBird+" ,feathers "+eg.feathers+" ,layEggs "+eg.layEggs+",Bones "+eg.Bones+" ,keel "+eg.keel);
        Swallow sw = new Swallow();
        System.out.println("Name "+sw.nameBird+" ,feathers "+sw.feathers+" ,layEggs "+sw.layEggs+",Bones "+sw.Bones+" ,keel "+sw.keel);
        Penguin pn = new Penguin();
        System.out.println("Name "+pn.nameBird+" ,feathers "+pn.feathers+" ,layEggs "+pn.layEggs+",Bones "+pn.Bones+" ,keel "+pn.keel);
        Chicken ch = new Chicken();
        System.out.println("Name "+ch.nameBird+" ,feathers "+ch.feathers+" ,layEggs "+ch.layEggs+",Bones "+ch.Bones+" ,keel "+ch.keel);
    }
}