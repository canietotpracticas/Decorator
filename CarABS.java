public class CarABS extends CarDecorator {

	public CarABS(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Se agrgan frenos ABS.");
	}
}