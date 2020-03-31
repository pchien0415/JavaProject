package LiskovSubstitution.bad;

public class badExample{
    public static void main(String[] args){
        Airplane ap = new Airplane();
        ap.button();
        System.out.println();
        //當我們呼叫button時，我們有時候可能會預期是呼叫要打開逃生門，然而此時卻呼叫成自爆
        //因此若我們能拉成一個父類別，去override他，可以讓我們更清楚呼叫這個funcion會發生什麼事
        Drone dp = new Drone();
        dp.button();

    }
}
class Airplane {
    public void button(){
        System.out.println("Button was pressed, \n" +
                "the emergency exit door will open in five seconds.");
    }
}

class Drone {
    public void button(){
        System.out.println("Button was pressed, \n" +
                "the drone is going to self-explosion");
    }
}