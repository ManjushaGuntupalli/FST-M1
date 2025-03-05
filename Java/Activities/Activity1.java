package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car carobj = new Car("Black","Manual",2014);

		carobj.displayCharacteristics();
		carobj.accelarate();
		carobj.brake();

	}

}
