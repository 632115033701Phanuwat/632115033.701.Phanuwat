package week7;

public class Main {
    public static void main(String[] args) {
        
        Dog d = new Dog("Lambo", "Golden", "brown", 3);
        System.out.println("My dog");
        d.size = "Big";
        d.bark = "Box Box";
        d.hair = "Long";

        d.intro();
        d.Run();
        d.Bark();
        d.isShortHair();

        Fish f = new Fish("Black", "Betta fish", "Black", 1);
        System.out.println("My fish");
        f.size = "Small";
        f.water = "fresh water";
        f.speed = "Slow";

        f.intro();
        f.IsSwimToTheSea();
        f.SwimFast();

        Bird b = new Bird("Savanna Nightjar", "Bird", "Brown", 2);
        System.out.println("My bird");
        b.country = "Savanna";
        b.speak = "chwip chwip";
        b.fly = "Fly";

        b.intro();
        b.Speak();
        b.ChekCountry();
        b.IsCanFly();


    }
}
