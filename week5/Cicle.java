package week5;

//Phanuwat Panya 632115033

public class Cicle {
    public static void main(String[] args) {
    Circ circle1 = new Circ(0, 0, 2.0);
    Circ circle2 = new Circ(1.0, 2.0, 3.0);
    Circ circle3 = new Circ(3.0, 5.0);
    Circ circle4 = new Circ(-1.0, -1.0, -1.0);

    System.out.println("Area of cir1 = "+ circle1.Area());
    System.out.println("Circumferrene of cir1= "+ circle1.Circum());
    System.out.println("Area of cir2 = "+ circle2.Area());
    System.out.println("Circumferrene of cir2= " + circle2.Circum());
    System.out.println("Area of cir3 = "+ circle3.Area());
    System.out.println("Circumferrene of cir3= " + circle3.Circum());
    System.out.println("Area of cir4 = "+ circle4.Area());
    System.out.println("Circumferrene of cir4= " + circle4.Circum() );
    System.out.println("Is ciecle 1 intersec circle 2; "+circle1.intersected(circle2));
    System.out.println("Is ciecle 1 intersec circle 3; "+circle1.intersected(circle3));

    }

}

class Circ{
    private double x;
    private double y;
    private double r;

    public Circ(double x, double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
        if(this.r<0)
         this.r = 0.0;
    }

    public Circ(double x,double y){
        this(x, y, 1.0);
    }

    public double Area(){
        return Math.PI*Math.pow(r,2);
    }

    public double Circum(){
        return Math.PI*2*r;
    }

    public boolean intersected(Circ circle ){
        double distance ;

        distance = Math.sqrt(Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2));
        if (distance < this.r+circle.r)
         return true;
         else
         return false;
    }
}