package zadaca3;

public class Proizvod {
	private String imenaproizvod;
	private int cena;
	private String proizvoditel;
	private int tezina;
	
	public Proizvod() {
		this.imenaproizvod = ("Bitolski jogurt ");
		this.cena = 105;
		this.proizvoditel = "Bimilk ";
		this.tezina = 2;
	}

	public String getImenaproizvod() {
		return imenaproizvod;
	}

	public void setImenaproizvod(String imenaproizvod) {
		this.imenaproizvod = imenaproizvod;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getProizvoditel() {
		return proizvoditel;
	}

	public void setProizvoditel(String proizvoditel) {
		this.proizvoditel = proizvoditel;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}
	
}
