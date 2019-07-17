
public class CarSinABS extends CarDecorator {

	public CarSinABS(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Se agrgan frenos convencionales.");
	}
}