package week7;

public class Fish extends Pet{
    String size ;
    String water;
    String speed;

    public Fish(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void IsSwimToTheSea(){
        System.out.println("My Fish "+ name +" Swim to the "+water);
    }
    public void SwimFast(){
        if(speed == "Fast"){
            System.out.println("Spee Fast : true");
        }else if(speed == "Slow"){
        System.out.println("Spee Fast : false");
        }
    }
}
