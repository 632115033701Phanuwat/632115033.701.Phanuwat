

//Phanuwat Panya 6302115033
public class Artist extends Person{

    String genre;
    String job0;
    String job1;
    String job2;
    String job3;
    String job4;

    public Artist(String name, int age, String gender ){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public void playMusic(){
        System.out.println(name+" is playing "+genre+" music.");
    }
    public void job4(){
        System.out.println(job4);
    }
}
