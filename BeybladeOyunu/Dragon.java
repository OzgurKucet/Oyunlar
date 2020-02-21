
public class Dragon extends Beyblade{
	
	private String kutsal_canavar;
	private String gizli_yetenek;
	
	
	public Dragon(String beybladeci, int donus_hizi, int saldiri_gucu,
			String kutsal_canavar, String gizli_yetenek) {
		super(beybladeci, donus_hizi, saldiri_gucu);
		this.kutsal_canavar = kutsal_canavar;
		this.gizli_yetenek = gizli_yetenek;
	}


	@Override
	public void bilgileri_goster() {
		super.bilgileri_goster();
		System.out.println("Kutsal canavar = "+ getKutsal_canavar());
		System.out.println("Gizli Yetenek = " + getGizli_yetenek());
		
	}
	
	public void Gizli_yetenek(){
		System.out.println("Takao Dragon ile konusuyor Dragon kendini topluyor ve 250 can kazanýyor");
		super.yenilen_sayi(-250);
	}

	@Override
	public void kutsal_canavari_ortaya_cikar() {
		System.out.println(getBeybladeci() + " " + kutsal_canavar + "ýný ortaya cýkariyor");
		System.out.println(getBeybladeci() + "nin saldirisi = " + "Hayalet Kasirga donus hýzý 50 azaldý 200 vurdu");
		super.yenilen_sayi(50);
	}
	
	public int canavarvurus(){
		return 200;
	}

	public String getKutsal_canavar() {
		return kutsal_canavar;
	}


	public void setKutsal_canavar(String kutsal_canavar) {
		this.kutsal_canavar = kutsal_canavar;
	}


	public String getGizli_yetenek() {
		return gizli_yetenek;
	}


	public void setGizli_yetenek(String gizli_yetenek) {
		this.gizli_yetenek = gizli_yetenek;
	}
	
	public void yenilensaldiri(int sayi){
		super.yenilen_sayi(sayi);
	}

}
