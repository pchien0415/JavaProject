package InterfaceSegregation.good;

//符合interface segregation
public class goodExample {
    public static void main(String[] args){
        Airplane ap = new Airplane();
        ap.action1(new Drone());
        ap.action1(new Fighter());
        ap.action2(new Fighter());
    }
}
class Airplane{
    public void action1(Tool1 a1){
        a1.fly();
        a1.engine();
    }
    public void action2(Tool2 a2){
        a2.manned();
    }
}
interface Tool1{
    public void fly();
    public void engine();
}
interface Tool2{
    public void manned();
}
class Drone implements Tool1{
    public void fly(){
        System.out.println("Drone can fly.");
    }
    public void engine(){
        System.out.println("Drone have engine.");
    }
}
class Fighter implements Tool1, Tool2{
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