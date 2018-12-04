package factory_design_main;

public class Lion implements AnimalInterface{
	
	@Override
	public void walk() {
		System.out.println("Lion.walk");
	}

	@Override
	public void jump() {
		System.out.println("Lion.jump");
	}

	@Override
	public void eat() {
		System.out.println("Lion.eat");
	}

}
