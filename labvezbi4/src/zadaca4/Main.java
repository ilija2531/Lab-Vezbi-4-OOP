package zadaca4;

public class Main {

	public static void main(String[] args) {
		Avtomobil avto1 = new Avtomobil("Audi", "A4", 230000, "sina");
		
		
		System.out.println("Marka: " + avto1.getMarka());
		System.out.println("Model: " + avto1.getModel());
		System.out.println("Pominati km: " + avto1.getPomkm());
		System.out.println("Vkupno pominati km: " + avto1.pomnoziKm(2));
		System.out.println("Boja: " + avto1.getBoja());
		

	}

}
