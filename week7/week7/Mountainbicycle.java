package week7;

public class Mountainbicycle extends bi{
    public Mountainbicycle(int Speed){
        Speed(Speed);
        System.out.println("Mountainbike!");
        if(checkSpeed(getSpeed())){
            Speed(getSpeed()-Speed);
        }
    }
    public void gear(int gear){
        Speed(getSpeed()+(gear*Breakkkk()));
        if (checkSpeed(getSpeed())) {
            Speed(getSpeed() - (gear * Breakkkk()));
        }
    }

    public void Break() {
        Speed(getSpeed() - Breakkkk());
    }
}
