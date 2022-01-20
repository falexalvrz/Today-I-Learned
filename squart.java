package reasoning;

public class squart {
	/*
	 * @param num is an integer number greater than o
	 * 
	 */
	public double sqrt(int num) {
		@SuppressWarnings("removal")
		double root = Math.sqrt(new Integer(num).doubleValue());
		return root;
	}
	/*
	 * What would be the best precondition for this method?
	 * ANSWER: num > 0. The Math.sqrt() method returns the rounded positive square root of a positive number; therefore, num must be 
	 * a positive integer number. Nevertheless, it is known that a number r is a square root of a number n if r^2 = n.
	 * 
	 * What would be the best postcondition for this method?
	 * ANSWER: the number is greater than or equal to its square root. In addition, if we take into account the correct precondition, the result
	 * would be greater than 0.
	 */

}
