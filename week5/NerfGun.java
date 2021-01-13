package week5;

//Phanuwat Panya 632115033

public class NerfGun {
	private int Ammun ;
	private static int Name ;

	public  NerfGun(){
		Ammun = 0;
		Name++;
	}

	public NerfGun(int ammuition){
		this.Ammun = ammuition;
		Name++;
	}

	public void fire() {
		if (Ammun > 0 ){
			System.out.println("BANG !!!");
			Ammun --;
		}
		else
		System.out.println("There is no ammuition");
	}

	public void reload(int i) {
		if (Ammun+i<=15)
		Ammun+=i;
		else
		System.out.println("Error!! the ammuition is overload");
	}

	public void displayNumOfAmmunition() {
		System.out.println(Ammun+" bullet left");
	
	}

	public void displayGunID() {
		System.out.println("The ID of this gun is "+ Name);
	}

}
