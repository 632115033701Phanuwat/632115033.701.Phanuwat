package week6;

//Phanuwat Panya 6302115033
public class InheritanceExample {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20,"Male");
        Job0 j = new Job0("TAN", 19,"Male");
        Job1 j1 = new Job1("Mark", 19, "Male");
        Job2 j2 = new Job2("Jame", 19, "Male");
        Job3 j3 = new Job3("Poom", 19, "Male");
        Job4 j4 = new Job4("Smat", 19, "Male");



        art.genre=" hip hop";
        j.job0="Engineer";
        j1.job1="Doctor";
        j2.job2="sell man";
        j3.job3="man sell";
        j4.job4="sell fish";
        
        art.introduce();
        art.playMusic();
        j.introduce();
        j.job0();
        j1.introduce();
        j1.job1();
        j2.introduce();
        j2.job2();
        j3.introduce();
        j3.job3();
        j4.introduce();
        j4.job4();
      
    }
}
