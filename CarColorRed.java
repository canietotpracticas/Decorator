public class CarColorRed extends CarDecorator {

	public CarColorRed(Car c) {
		super(c);
	}

    @Override
	public void assemble(){
		super.assemble();
		System.out.print(" Se pinta del color rojo.");
	}
}