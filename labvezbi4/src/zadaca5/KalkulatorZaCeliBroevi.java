package zadaca5;

public class KalkulatorZaCeliBroevi implements IMatematickiOperaciiCeliBroevi {

	@Override
	public int odzemanje(int x, int y) {
		return x-y;
	}

	@Override
	public long sobiranje(int x, int y) {
		return x+y;
		
	}

	@Override
	public long mnozenje(int x, int y) {
		return x*y;
		
	}

	@Override
	public long delenje(int x, int y) {
		return x/y;
	}

	@Override
	public int ostatok(int x, int y) {
		return x%y;
	}

	@Override
	public long stepenuvanje(int x, int y) {
		return (long)Math.pow(x,y);
	}

}
