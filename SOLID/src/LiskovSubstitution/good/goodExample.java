package LiskovSubstitution.good;

public class goodExample{
    public static void main(String[] args){
        //it is more clear that which button is called
        Airplane ap = new Airplane();
        ap.button();
        System.out.println();
        ap = new Fighter();
        ap.button();
        System.out.println();
        ap = new Drone();
        ap.button();
    }
}
class Airplane {
    public void button(){
        System.out.println("Button was pressed, \n" +
                            "the emergency exit door will open in five seconds.");
    }
}

class Fighter extends Airplane {
    @Override
    public void button(){
        System.out.println("Button was pressed, \n" +
                            "you can drop the bomb");
    }
}

class Drone extends Airplane {
    @Override
    public void button(){
        System.out.println("Button was pressed, \n" +
                            "the drone is going to self-explosion");
    }
}