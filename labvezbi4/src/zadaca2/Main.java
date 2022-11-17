package zadaca2;

public class Main {

	public static void main(String[] args) {
		Restoran rest1 = new Restoran();
		
		rest1.setImenarestoran("Restoran Adriatik");
		rest1.setLokacija("Bitola");
		rest1.setTelefon("047227510");
		rest1.setBrojnasedista(100);
		
		System.out.println("Ime: " + rest1.getImenarestoran());
		System.out.println("Lokacija: " + rest1.getLokacija());
		System.out.println("Telefon: " + rest1.getTelefon());
		System.out.println("Br. na sedista: " + rest1.getBrojnasedista());
		

	}

}
