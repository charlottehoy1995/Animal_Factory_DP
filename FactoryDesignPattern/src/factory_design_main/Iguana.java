package factory_design_main;

public class Iguana implements AnimalInterface {

	@Override
	public void walk() {
		System.out.println("Iguana.walk");
	}

	@Override
	public void jump() {
		System.out.println("Iguana.jump");
	}

	@Override
	public void eat() {
		System.out.println("Iguana.eat");
	}
	
	

}
