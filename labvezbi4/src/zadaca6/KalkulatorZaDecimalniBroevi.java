package zadaca6;

public class KalkulatorZaDecimalniBroevi implements IMatematickiOperaciiVrzDecimalniBroevi {

	@Override
	public double odzemanje(double x, double y) {
		return x-y;
	}

	@Override
	public double sobiranje(double x, double y) {
		return x+y;
	}

	@Override
	public double mnozenje(double x, double y) {
		return x*y;
	}

	@Override
	public double delenje(double x, double y) {
		return x/y;
	}

	@Override
	public double ostatok(double x, double y) {
		return x%y;
	}

	@Override
	public double stepenuvanje(double x, double y) {
		return Math.pow(x, y);
	}

}
