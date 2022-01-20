package fueltank;
/**
 * Main Class of FuelTank Java program.
 * @author slashratx
 * @since 01.11.2022
 *
 */

public class Main {
	
	public static void main(String[] arg) {
		FuelTank fuelTank = new FuelTank(40,20);
		fuelTank.fill(10);
		fuelTank.consume(15);
		System.out.println("The amount of fuel in the tank is "+ fuelTank.getTankLevel());
	}

}
