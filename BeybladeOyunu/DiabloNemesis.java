
public class DiabloNemesis extends Beyblade{

	private String kutsal_canavar;

	public DiabloNemesis(String beybladeci, int donus_hizi, int saldiri_gucu,String kutsal_canavar) {
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
		
		System.out.println(getBeybladeci() + " " + kutsal_canavar + "�n� ortaya c�kariyor");
		System.out.println(getBeybladeci() + "nin saldirisi = " + "Y�k�m efendisi 400 vurdu");
		super.yenilen_sayi(0);
	}
	public int canavarvurus(){
		return 400;
	}

	public String getKutsal_canavar() {
		return kutsal_canavar;
	}

	public void setKutsal_canavar(String kutsal_canavar) {
		this.kutsal_canavar = kutsal_canavar;
	}
	
	
	
	
}
