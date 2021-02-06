package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        Person person2;
        Person person3;
        Person person4;
        Person person5;
        Person person6;
        person1 = new Person("Mark",2001);
        person2 = new Sheriff("Mateo", 1988,"Cailfornia");
        person3 = new Teacher("Ball", 1977,"CMU");
        person4 = new Prime("Tu", 1954,"Thailand");
        person5 = new Football("Messi", 1987,"Barcelona football club");
        person6 = new Fisherman("Toon", 2002,"Thailand");

        person1.introduce();
        person2.introduce();
        person3.introduce();;
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
    
}
