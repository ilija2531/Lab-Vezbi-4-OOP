package zadaca4;

public class Avtomobil {
	private String marka;
	private String model;
	private double pomkm;
	private String boja;
	
	public Avtomobil(String marka, String model, double pomkm, String boja) {
		this.marka = marka;
		this.model= model;
		this.pomkm = pomkm;
		this.boja = boja;
		
	}
	public double pomnoziKm (int pomnozikm) {
		return this.pomkm * pomnozikm;

		
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPomkm() {
		return pomkm;
	}
	public void setPomkm(double pomkm) {
		this.pomkm = pomkm;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	

}
