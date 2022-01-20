package reasoning;

public class FuelTank {
	double tankMax; 
	double tankLevel;
	
	/*
	 * FuelTank constructor of the class
	 * 
	 * @param tankMax   the capacity of the tank
	 * @param tankLevel the amount of fuel in the tank
	 */
	
	FuelTank (double tankMax, double tankLevel){
		this.tankMax = tankMax;
		this.tankLevel = tankLevel;
	}
	
	public double getTankLevel() {
		return tankLevel;
	}
	public double getTankMax() {
		return tankMax;
	}
	public boolean empty() {
		return tankLevel == 0;
	}
	public boolean full() {
		return tankLevel == tankMax;
	}
	/*
	 * adds fuel to tank
	 * @param amount amount of fuel to add
	 * 
	 * @precondition: amount >0.0
	 * @precondition: not full()
	 * 	amount <= getTankMax() - getTankLevel()
	 * @postcondition: !empty()
	 */
	public void fill(double amount) {
		assert amount > 0.0;
		assert amount <= getTankMax() - getTankLevel();
		tankLevel = tankLevel + amount;
		assert !empty();
	}
	/* *The consume method is a mutator to consume amount of fuel
	 * The param amount is the amount of fuel to consume 
	 * 
	 * (THESE ARE INCORRECT CONDITIONS FOR PROBLEM BELOW)
	 * @precondition: 0.0 < amount < getTankLevel()
	 * @postcondition: tankLevel > tankLevel_intitial
	 */
	
	public void consume(double amount) {
		tankLevel = tankLevel - amount;
	}
	/*
	 * If you consider that preconditions and postconditions are not correct, indicate 
	 * what preconditions and postconditions statement would be appropriate: (from above consume conditions)
	 * ANSWER: 
	 * @precondition: 0.0 < amount <= getTankLevel()
	 * @postcondition: tankLevel < tankLevel_initial
	 * 
	 * As precondition of consume(double amount) method: The tank level must be the maximum amount of consumed fuel. 
	 * As postcondition, the tank level after consumption will be always lesser than previous tank level (tankLevel_initial), 
	 * taking into account that amount must be greater than 0. 
	 */
}
