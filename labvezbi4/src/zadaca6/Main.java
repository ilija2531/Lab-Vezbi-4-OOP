package zadaca6;

public class Main {

	public static void main(String[] args) {
		double x= 5;
		double y= 10;
		
		KalkulatorZaDecimalniBroevi decbr = new KalkulatorZaDecimalniBroevi();
		System.out.println("Odzemanje: " + decbr.odzemanje(x, y));
		System.out.println("Sobiranje: " + decbr.sobiranje(x, y));
		System.out.println("Mnozenje: " + decbr.mnozenje(x, y));
		System.out.println("Delenje: " + decbr.delenje(x, y));
		System.out.println("Ostatok: " + decbr.ostatok(x, y));
		System.out.println("Stepenuvanje: " + decbr.stepenuvanje(x, y));
		

	}

}
