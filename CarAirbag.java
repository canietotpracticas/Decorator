public class CarAirbag extends CarDecorator {

	public CarAirbag(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Se agrgan bolsas de aire.");
	}
}