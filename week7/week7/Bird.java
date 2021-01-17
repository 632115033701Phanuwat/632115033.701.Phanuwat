package week7;

public class Bird extends Pet {
    String country;
    String speak;
    String fly;
    
    public Bird(String name, String species, String color, int age){
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }
    public void ChekCountry(){
        System.out.println("My Birb country is "+ country);
    }
    public void Speak(){
        System.out.println("My bird Speak :"+ speak);      
    }
    public void IsCanFly(){
        if(fly == "Fly"){
            System.out.println("Is can fly : true");
        }else if(fly == "Notfly"){
        System.out.println("Is can fly : false");
        }
    }

}
