package fueltank;

public class FuelTankTest {

	public class testFuelTank {
		public void testTankLevel() {
			FuelTank tank = new FuelTank(60, 10);
			System.out.println("Tank level expected: 10 liters. Value obtained: " + tank.getTankLevel());
			System.out.println("Tank level capacity is: " + tank.getTankMax() + "liters");
		}
		public void testFullTank() {
			FuelTank tank = new FuelTank(60, 60);
			System.out.println("The tank should be full, the test says that the tank is: ");
			System.out.println(tank.isFull());
		}
		public void testFillMiddleTank() {
			FuelTank tank = new FuelTank(60,10);
			tank.fill(20);
			System.out.println("Tank level expected: 30 liters. Value obtained: " + tank.getTankLevel());
		}
		public void testFillMiddleTankCheckPostCondition() {
			int initTank = 10;
			FuelTank tank = new FuelTank(60, initTank);
			tank.fill(20.0);
			boolean postCondition = tank.getTankLevel() > initTank;
			System.out.println("Expecting tankLevel > tankLevel_initial: true. Obtained: " + postCondition);
		}
		public void testFillConsumption() {
			FuelTank tank = new FuelTank(60, 10);
			
			tank.fill(50);
			System.out.println("Tank level expected: 60 liters. Obtained: " + tank.getTankLevel());
			System.out.println("Tank expected to be full. Obtained: " + tank.isFull());
			
			tank.consume(20.0);
			System.out.println("Tank level expected: 40.0 liters. Obtained: " + tank.getTankLevel());
			System.out.println("Tank level expected not to be full. Obatined: " + !tank.isFull());
		}
	}
}
