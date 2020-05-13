



public class Function1 extends Function{

	@Override
	public String answerString(double optVal, double x, double y, double z) {
		return String.format("The visitor must run %.2f miles along shore then swim %.2f miles to reach the island in the minimum time of %.2f hours .", x, y, optVal);
	}

	@Override
	public double fnValue(double x) {
		if (x <= 0.0)
			return Double.MAX_VALUE;
		else
			return (x / 8) + ((Math.sqrt(4 + Math.pow(6 - x, 2))) / 3);
	}

	@Override
	public double getXVal(double x) {
		return x;
	}

	@Override
	public double getYVal(double x) {
		return Math.sqrt(4 + Math.pow(6 - x, 2));
	}

	@Override
	public double getZVal(double x) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "Minimize the time it takes to reach the island by running and swimming.";
	}
}