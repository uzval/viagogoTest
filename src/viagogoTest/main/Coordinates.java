package viagogoTest.main;

/*
 * This class carries the structure of the co-ordinates and is also used to override the compareTo method 
 */
public class Coordinates implements Comparable<Coordinates> {
	private double x;
	private double y;
	private double xTarget;
	private double yTarget;

	// Constructor for Coordinates class
	public Coordinates(double xTarget, double yTarget, double x, double y) {
		this.xTarget = xTarget;
		this.yTarget = yTarget;		
		this.x = x;
		this.y = y;
		
	}

	//Calculates the Manhattan Distance between the current Point and the Target Point
	public double getDistance() {
		return Math.abs(x - xTarget) + Math.abs(y - yTarget);
	}

	// Over rides Compareto Method to use getDistance for comparison
	@Override
	public int compareTo(Coordinates newCoordinate) {

		int compareValue = Double.compare(getDistance(), newCoordinate.getDistance());
		if (compareValue == 0) {
			compareValue = Double.compare(x, newCoordinate.x);
			if (compareValue == 0) {
				compareValue = Double.compare(y, newCoordinate.y);
			}
		}
		return compareValue;
	}
	
	//Getter Method for X coordinate
	public double getX(){
		return x;
	}
	
	//Getter Method for Y coordinate
	public double getY(){
		return y;
	}
}