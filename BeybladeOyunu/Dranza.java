
public class Dranza extends Beyblade{
	
	private String kutsal_canavar;

	public Dranza(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar = kutsal_canavar;
	}

	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar = "+ getKutsal_canavar());
		
	}

	@Override
	public void kutsal_canavari_ortaya_cikar() {
		System.out.println(getBeybladeci() + " " + kutsal_canavar + "ını ortaya cıkariyor");
		System.out.println(getBeybladeci() + "nin saldirisi = " + " Alev kilici donus hızı 70 azaldı 250 vurdu");
		super.yenilen_sayi(70);
	}
	public int canavarvurus(){
		return 250;
	}
	
	public String getKutsal_canavar() {
		return kutsal_canavar;
	}

	public void setKutsal_canavar(String kutsal_canavar) {
		this.kutsal_canavar = kutsal_canavar;
	}

	public void yenilensaldiri(int sayi){
		super.yenilen_sayi(sayi);
	}
	
	
	
	
	

}
