package zadaca5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 4;
		KalkulatorZaCeliBroevi celbr = new KalkulatorZaCeliBroevi();
		System.out.println("Odzemanje: " + celbr.odzemanje(x, y));
		System.out.println("Sobiranje: " + celbr.sobiranje(x, y));
		System.out.println("Mnozenje: " + celbr.mnozenje(x, y));
		System.out.println("Delenje: " + celbr.delenje(x, y));
		System.out.println("Ostatok: " + celbr.ostatok(x, y));
		System.out.println("Stepenuvanje: " + celbr.stepenuvanje(x, y));
		
		
	}

}
