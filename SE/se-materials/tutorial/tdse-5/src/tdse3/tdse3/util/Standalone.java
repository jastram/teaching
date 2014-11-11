package tdse3.tdse3.util;

import tdse3.tdse3.Controller;
import tdse3.tdse3.Tdse3Factory;

public class Standalone {

	public static void main(String[] args) {
		Controller controller = Tdse3Factory.eINSTANCE.createController();
		while (true) {
			print(controller);
			controller.tick();
		}
	}

	private static void print(Controller controller) {
		System.out.println("cars: " + controller.getCarLight().getColors() +
				"peds: " + controller.getPedLight().getColors());
	}

}
