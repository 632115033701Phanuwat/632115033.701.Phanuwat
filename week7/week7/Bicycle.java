package week7;

public class Bicycle extends bi{
    public Bicycle(int Speed){
        Speed(Speed);
        System.out.println("Bike!");
        if(checkSpeed(getSpeed())){
            Speed(getSpeed()-Speed);
        }
    }
    public void speedup(){
        Speed(getSpeed()+ getSpeed());
        if (checkSpeed(getSpeed())) {
            Speed(getSpeed() - getSpeed());
        }
    }

    public void Break() {
        Speed(getSpeed() - Breakkkk());
    }
}
