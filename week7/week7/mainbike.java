package week7;


public class mainbike {
    public static void main(String[] args) {
        Bicycle b = new Bicycle(10);
        b.speedup();
        b.Break();
        b.speedup();
        b.disSpeed();
        Mountainbicycle bm = new Mountainbicycle(10);
        bm.gear(3);
        bm.disSpeed();
        bm.Break();
        bm.disSpeed();

    }
    
}
