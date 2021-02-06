package week9;

class Sheriff extends Person{
    String workState;

    public Sheriff(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;
    }

    //overiding method
    public void introduce() {
        super.introduce();
        System.out.println("I'm a sheriff and work in "+ workState + ".");
    }
    
}

class Teacher extends Person{
    String workState;

    public Teacher(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a teacher and teach the students in "+ workState + ".");
    }
}

class Prime extends Person{
    String workState;

    public Prime(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a prime minister and work in "+ workState + ".");
    }
}

class Football extends Person{
    String workState;

    public Football(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a football and work in "+ workState + ".");
    }
}

class Fisherman extends Person{
    String workState;

    public Fisherman(String name, int bornYear, String workState){
        super(name, bornYear);
        this.workState = workState;  
    }

    public void introduce() {
        super.introduce();
        System.out.println("I'm a Fishemane and Fishing in "+ workState + ".");
    }
}