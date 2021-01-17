package week7;

public class Dog extends Pet {
    String size;
    String bark;
    String hair;
    
    public Dog(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void Run(){
        System.out.println("My dog "+ name +" to the Savanna");
    }
    public void Bark(){
        System.out.println(size + " bark "+ bark);      
    }
    public void isShortHair(){
        if(hair == "Short"){
            System.out.println("Short hair : true");
        }else if(hair == "Long"){
        System.out.println("Short hair : false");
        }
    }

}
