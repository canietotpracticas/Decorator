
public class Consecionario {

	public static void main(String[] args) {
		Car car1 = new CarABS(new CarColorRed(new BasicCar()));
        car1.assemble();
		System.out.println("\n*****");

        //De esta forma, se pueden crear la cantidad deseada de carros, con diferentes caracteristicas.

	}

}