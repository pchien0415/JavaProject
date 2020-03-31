package DependencyInversion.good;
public class goodExample {
    public static void main(String[] args) {
        Airplane ap = new Airplane();
        ap.siren(new Fighter());
        ap.siren(new Drone());
        ap.siren(new Airliner());
    }
}
class Airplane{
    public void siren(Sound sound){
        System.out.println(sound.getSiren());
    }
}
interface Sound{
    public String getSiren();
}
class Fighter implements Sound{
    @Override
    public String getSiren() {
        return "Da Da Da Da!";
    }
}
class Drone implements Sound{
    @Override
    public String getSiren() {
        return "Hong Hong Hong~";
    }
}
class Airliner implements Sound{
    @Override
    public String getSiren() {
        return "__________";
    }
}