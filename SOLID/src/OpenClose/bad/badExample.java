package OpenClose.bad;

public class badExample {
    public static void main(String[] args) {
        Fighter fp = new Fighter(1000, "Mamba");
        fp.getInfo();
        System.out.println();
        Drone dp = new Drone(500, "Bermuda Triangle");
        dp.getInfo();
    }
}
//若是不用extend的方法去做，則會讓move, gas, planID重複了好幾遍
//這樣會讓code變得很冗長且不精簡
class Fighter {
    Fighter(int gas, String name){
        this.gas = gas;
        this.planeID = name;
    }
    public void move(int flag) {
        if(flag == 1) System.out.println("forward");
        else if(flag == 2) System.out.println("back");
        else if(flag == 3) System.out.println("left");
        else if(flag == 4) System.out.println("right");
    }
    private int gas = 10;
    private String planeID;

    public void getInfo(){
        System.out.println("I am " + planeID);
        System.out.println("Maximum gas: " + gas);
        System.out.println("Maximum bullet: " + bullet);
        System.out.println("Maximum grenade: " + grenade);

    }
    public void shooting(){
        System.out.println("Start Shooting");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++)
                System.out.print("Da ");
            System.out.println();
        }
    }
    private final int bullet = 10000;
    private final int grenade = 10;

}
class Drone {
    Drone(int gas, String name){
        this.gas = gas;
        this.planeID = name;
    }
    public void move(int flag) {
        if(flag == 1) System.out.println("forward");
        else if(flag == 2) System.out.println("back");
        else if(flag == 3) System.out.println("left");
        else if(flag == 4) System.out.println("right");
    }
    private int gas = 10;
    private String planeID;
    public void getInfo(){
        System.out.println("I am " + planeID);
        System.out.println("Maximum gas: " + gas);
    }
    public void takePic(){
        /* do something camera can do */
        System.out.println("The photo is save.");
    }

}

