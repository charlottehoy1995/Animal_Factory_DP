package factory_design_main;

public class Main {
	
	public static void main(String[] args) {
		AnimalInterface Iguana1 = AnimalFactory.create("Iguana");
		Iguana1.walk();
		Iguana1.jump();
		Iguana1.eat();
		AnimalInterface Lion1 = AnimalFactory.create("Lion");
		Lion1.walk();
		Lion1.jump();
		Lion1.eat();
	}

}
