package SingleResponsibility.bad;

public class badExample {
    public static void main(String[] args) {
        Plane p = new Plane();
        p.job("Airliner");
        p.job("Fighter");
        //When Drone call job is weird because Drone can't carry people
        //Not every plane can carry people, so we should distinguish every plane by thier job
        p.job("Drone");
    }
}
class Plane{
    public void job(String name){
        System.out.println(name + " can carry people.");
    }
}
