public class Human{
    public void hit(Animal animal) {
        System.out.println(animal.roar());
        
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Human human = new Human();
        Animal fish = new Fish();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog);

        dog = new Cat();
        System.out.println("The second calling hit(Animal)");
        human.hit(dog);

        System.out.println("The third calling hit(Animal)");
        human.hit(fish);
    }
}