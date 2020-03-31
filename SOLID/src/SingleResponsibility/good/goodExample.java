package SingleResponsibility.good;

public class goodExample {
    public static void main(String[] args) {
        AirLiner ap = new AirLiner();
        ap.job("AirLiner");
        Drone dp = new Drone();
        dp.job("Drone");
        Fighter fp = new Fighter();
        fp.job("Fighter");
    }
}
class AirLiner{
    public void job(String name){
        System.out.println(name + " can carry people.");
    }
}
class Drone {
    public void job(String name){
        System.out.println(name + " can detect and take picture.");
    }
}
class Fighter {
    public void job(String name){
        System.out.println(name + " can fight enemy.");
    }
}