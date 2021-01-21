package week7;

public class bi {
    private int Speed;
    final private static int Break = 5;
    public bi(){
        
    }
    public void Speed(int CurrentSpeed){
        this.Speed = CurrentSpeed;
    }
    public int getSpeed(){
        return Speed;
    }
    public int Breakkkk(){
        return Break;
    }
    public void disSpeed(){
        System.out.println(getSpeed()+" km/h.");
    }
    public boolean checkSpeed(int speed){
        if(speed > 99){
            speed = 99;
            return true;
        }
        else {
            return false;
        }
    }
}
