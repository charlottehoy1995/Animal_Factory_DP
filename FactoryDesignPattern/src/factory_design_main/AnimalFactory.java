package factory_design_main;

public class AnimalFactory {

	public static AnimalInterface create(String type) {
		if(type.equals("Iguana")) {
			return new Iguana();
		}
		
		else if(type.equals("Lion")) {
			return new Lion();
		}
		
		return null;
	}

}
