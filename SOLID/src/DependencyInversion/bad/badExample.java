package DependencyInversion.bad;
//siren 飛機的轟鳴聲
public class badExample {
    public static void main(String[] args) {
        Airplane ap = new Airplane();
        ap.siren(new Fighter());
        ap.siren(new Drone());
        ap.siren(new Airliner());
    }
}
class Airplane{
    public void siren(Fighter sound){
        System.out.println(sound.getSiren());
    }
    public void siren(Drone sound){
        System.out.println(sound.getSiren());
    }
    public void siren(Airliner sound){
        System.out.println(sound.getSiren());
    }
}
class Fighter{
    public String getSiren() {
        return "Da Da Da Da!";
    }
}
class Drone{
    public String getSiren() {
        return "Hong Hong Hong~";
    }
}
class Airliner{
    public String getSiren() {
        return "__";
    }
}