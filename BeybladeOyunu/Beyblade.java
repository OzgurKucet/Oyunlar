
public class Beyblade {

	private String beybladeci;
	private int donus_hizi;
	private int saldiri_gucu;
	
	public Beyblade(String beybladeci, int donus_hizi, int saldiri_gucu) {
		this.beybladeci = beybladeci;
		this.donus_hizi = donus_hizi;
		this.saldiri_gucu = saldiri_gucu;
	}
	
	public void saldir(){
		System.out.println(getBeybladeci() + "  " + getSaldiri_gucu() + " saldiri gucu ile " + getDonus_hizi() + "donus hizi ile saldiriyor" );
		
	}
	
	public int canavarvurus(){
		return 0;
	}
	
	public void bilgileri_goster(){
		System.out.println("Beybladecinin ismi " + getBeybladeci());
		System.out.println("Saldiri_gucu = "+ getSaldiri_gucu());
		System.out.println("Donus_hýzý = "+ getDonus_hizi());
		
	}
	
	public void kutsal_canavari_ortaya_cikar(){
		System.out.println("Beyblede kutsal canavara sahip degil");
		
	}
	public void Gizli_yetenek(){
		
		
	}

	public String getBeybladeci() {
		return beybladeci;
	}

	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}

	public int getDonus_hizi() {
		return donus_hizi;
	}

	public void setDonus_hizi(int donus_hizi) {
		this.donus_hizi = donus_hizi;
	}

	public int getSaldiri_gucu() {
		return saldiri_gucu;
	}

	public void setSaldiri_gucu(int saldiri_gucu) {
		this.saldiri_gucu = saldiri_gucu;
	}
	
	public void yenilen_sayi(int sayi){
		donus_hizi -= sayi;
	}
}
