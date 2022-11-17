package zadaca1;

public class Main {

	public static void main(String[] args) {
		Covek covek1 = new Covek() ;
		
		covek1.setIme("Ilija");
		covek1.setPrezime("Bogdanovski");
		covek1.setMatbroj("2006002410057");
		
		System.out.println(covek1.getIme());
		System.out.println(covek1.getPrezime());
		System.out.println(covek1.getMatbroj());
		

	}

}
