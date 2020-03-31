package OpenClose.good;

public class goodExample {
    public static void main(String[] args) {
        Fighter fp = new Fighter(1000, "Mamba");
        fp.getInfo();
        System.out.println();
        Drone dp = new Drone(500, "Bermuda Triangle");
        dp.getInfo();
    }
}

class Plane{
    public void getInfo(){
        System.out.println("I am " + getPlaneID());
        System.out.println("Maximum gas: " + getGas());
    }
    public void move(int flag) {
        if(flag == 1) System.out.println("forward");
        else if(flag == 2) System.out.println("back");
        else if(flag == 3) System.out.println("left");
        else if(flag == 4) System.out.println("right");
    }
    private int gas = 10;
    private String PlaneID;
    public void setGas(int gas){
        this.gas = gas;
    }
    public void setPlaneID(String name){
        this.PlaneID = name;
    }
    public int getGas(){
        return gas;
    }
    public String getPlaneID(){
        return PlaneID;
    }
}

class Fighter extends Plane{
    Fighter(int gas, String name){
        setGas(gas);
        setPlaneID(name);
    }
    @Override
    public void getInfo(){
        System.out.println("I am " + getPlaneID());
        System.out.println("Maximum gas: " + getGas());
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

class Drone extends Plane{
    Drone(int gas, String name){
        setGas(gas);
        setPlaneID(name);
    }
    @Override
    public void getInfo(){
        System.out.println("I am " + getPlaneID());
        System.out.println("Maximum gas: " + getGas());
    }
    public void takePic(){
        /* do something camera can do */
        System.out.println("The photo is save.");
    }

}

