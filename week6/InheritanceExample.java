package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20);

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();
    }
    
}
