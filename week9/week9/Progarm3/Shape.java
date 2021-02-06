package week9.Progarm3;

public class Shape {
    public String toString(){
     return "This is a Shape";
    }
    public static void main(String[] args) {
        Shape  shape1 = new Cube(5, 5, 5);

        System.out.println(shape1.toString());
    }
    
}
