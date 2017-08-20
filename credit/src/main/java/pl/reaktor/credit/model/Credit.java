package pl.reaktor.credit.model;

public class Credit {

	
	private double kwota;
	private int okres;
	
	public Credit() {
		super();
	}
	public Credit(double kwota, int okres) {
		super();
		this.kwota = kwota;
		this.okres = okres;
	}
	public double getKwota() {
		return kwota;
	}
	public void setKwota(double kwota) {
		this.kwota = kwota;
	}
	public int getOkres() {
		return okres;
	}
	public void setOkres(int okres) {
		this.okres = okres;
	}
	
	public double mk(){
		return getKwota()*1.05;
	}
	public double ck(){
		return getOkres()*mk();
	}
	
}
