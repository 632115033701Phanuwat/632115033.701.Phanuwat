package week9.Progarm3;

class Rectangle extends Shape {
    private int Long1;
    private int Height;

    public Rectangle(int Long1,int Height){
        this.Long1 = Long1;
        this.Height = Height;

    }

    //overiding method
    public String toString(){
        return super.toString() + "\nThis is a rectangle with width as "+ Long1 + " and height as "+ Height;

    }
    
}
