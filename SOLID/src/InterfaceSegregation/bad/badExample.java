package InterfaceSegregation.bad;
//不符合interface segregatio
public class badExample {
    public static void main(String[] args){
        Airplane ap = new Airplane();
        ap.action(new Drone());
        ap.action(new Fighter());
    }
}
class Airplane{
    public void action(Tool a1){
        a1.manned();
        a1.fly();
        a1.engine();
    }
}
interface Tool{
    void manned();
    void fly();
    void engine();
}
class Drone implements Tool{
    public void manned(){
        System.out.println("Drone can carry people.");
    }
    public void fly(){
        System.out.println("Drone can fly.");
    }
    public void engine(){
        System.out.println("Drone have engine.");
    }
}
class Fighter implements Tool{
    public void manned(){
        System.out.println("Fighter can carry people.");
    }
    public void fly(){
        System.out.println("Fighter can fly.");
    }
    public void engine(){
        System.out.println("Fighter have engine.");
    }
}