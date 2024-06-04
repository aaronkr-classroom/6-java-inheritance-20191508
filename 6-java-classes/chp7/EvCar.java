public class EvCar extends Car {
	int charge = 100;
	
	EvCar(){
	super(2024,"Tesla","Modelx"); 

}
	int getCharge() {
		return this.charge;
	}
	void charge() {
		this.charge = 100;
		System.out.println("You charged your car.");
	}
	 void drive() {
	        this.charge -= 10;
	        this.km += 200;
	        System.out.println("You drove"+this.km+"km and have"+this.charge+"%batter.");;
	    }
	
}
