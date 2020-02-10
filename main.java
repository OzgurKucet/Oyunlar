import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class main {
	
	private static Kart kartlar[][] = new Kart[4][4];
	private static String harfler[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","Ö","P","R","S","Þ","T","U","V","Y","Z"};
	

public static void kartlaridagit1(){
		
	int i,j,k,t,cik,sayi;
	Random rand = new Random();
		
	for(i=0;i<kartlar.length/2;i++){
		for(j=0;j<kartlar[0].length;j++){
			sayi = rand.nextInt(24);				
			kartlar[i][j] = new Kart(harfler[sayi]);
			kartlar[i+2][j] = new Kart(harfler[sayi]);

		}			
	}
	
}		
	
public static void kartlaridagit(){
	
	int i,j,k,t,cik,sayi;
	Random rand = new Random();
	
	for(i=0;i<kartlar.length/2;i++){
		for(j=0;j<kartlar[0].length;j++){
			while(true){
				cik=0;
				sayi = rand.nextInt(24);
				for(k=0;k<i;k++){
					for(t=0;t<j;t++){
						if(kartlar[k][t].getDeger()== harfler[sayi]){
							cik=1;
						}
					}
				}
				if(cik==0){
					kartlar[i][j] = new Kart(harfler[sayi]);
					kartlar[i+kartlar.length/2][j] = new Kart(harfler[sayi]);
					break;
				}
				continue;
			}			
		}
	}
	
	
}	
		
public static void karistir(){
	
	int x,y;
	Kart temp;
	
	Random rand = new Random();
	
	for(int i=0;i<kartlar.length;i++){
		for(int j=0;j<kartlar[0].length;j++){
			x = rand.nextInt(kartlar.length);
			y = rand.nextInt(kartlar.length);
			temp = kartlar[i][j];
			kartlar[i][j] = kartlar[x][y];
			kartlar[x][y] = temp;
			
		}
	}
}

public static void tahmin_et(){
	
	Scanner scan = new Scanner(System.in);
	int index1,index2;
	
	while(true){
		System.out.print("lütfen kacýnci kart acýlsýn yazýn 1 ile "+(kartlar.length*kartlar[0].length));
		index1 = scan.nextInt();
		
		if(index1 == -1){
			break;
		}
		
		int i = (index1-1)/kartlar.length;
		int j = (index1-1)%kartlar.length;
		
		if(index1 < 1 || index1 > kartlar.length*kartlar[0].length || kartlar[i][j].isTahmin()){
			System.out.println("Hatalý giriþ birdaha deneyin.");
			continue;
		}
		else{
			break;
		}
	}
	
	if(index1 == -1){
		
		System.out.println("Oyun Kaydedilsin mi?(yes,no)girin");		
		while(true){
			String kayýt = scan.nextLine();
			if(kayýt.equals("yes")){
				OyunKayýt.oyunKaydet(kartlar);
				System.out.println("Programdan çýkýlýyor...");
				System.exit(1);
			}
			else if(kayýt.equals("no")){
				System.out.println("Program kaydedilmedi...");
				System.out.println("Programdan çýkýlýyor...");
				System.exit(1);
			}
			else{
				System.out.println("tekrar girin:");
			}
		}
		
	}
	
	
	int i = (index1-1)/kartlar.length;
	int j = (index1-1)%kartlar.length;
	
	kartlar[i][j].setTahmin(true);
			
	oyuntahtasi();
	
	while(true){
		System.out.print("2.kart için lütfen kacýnci kart acýlsýn yazýn 1 ile "+(kartlar.length*kartlar[0].length));
		index2 = scan.nextInt();
		
		if(index2 == -1){
			break;
		}
		
		int k = (index2-1)/kartlar.length;
		int l = (index2-1)%kartlar.length;
		
		if(index2 < 1 || index2 > kartlar.length*kartlar[0].length || kartlar[k][l].isTahmin()){
			System.out.println("Hatalý giriþ birdaha deneyin.");
			continue;
		}
		else{
			break;
		}
	}
	
	if(index2==-1){
		
		System.out.println("Oyun Kaydedilsin mi?(yes,no)girin");		
		
		while(true){
			String kayýt = scan.nextLine();
			if(kayýt.equals("yes")){
				kartlar[i][j].setTahmin(false);
				OyunKayýt.oyunKaydet(kartlar);
				System.out.println("Programdan çýkýlýyor...");
				System.exit(1);
			}
			else if(kayýt.equals("no")){
				kartlar[i][j].setTahmin(false);
				System.out.println("Program kaydedilmedi...");
				System.out.println("Programdan çýkýlýyor...");
				System.exit(1);
			}
			else{
				System.out.println("tekrar girin:");
			}
		}
		
	}
	
	int k = (index2-1)/kartlar.length;
	int l = (index2-1)%kartlar.length;
	
	kartlar[k][l].setTahmin(true);
	oyuntahtasi();
	
	if(kartlar[i][j].getDeger() != kartlar[k][l].getDeger()){
		kartlar[k][l].setTahmin(false);
		kartlar[i][j].setTahmin(false);
	}
	
	
	
	
}

public static boolean oyun_bitti_mi(){
	
	int i,j;
	for(i=0;i<kartlar.length;i++){
		for(j=0;j<kartlar[i].length;j++){
			
			if(kartlar[i][j].isTahmin() == false){
				return false;
			}
			
		}		
	}
	return true;
}

public static void oyuntahtasiilk(){
	
	int i,j,k=1;
	System.out.println("------------------");
	for(i=0;i<kartlar.length;i++){
		for(j=0;j<kartlar[0].length;j++){
				
				System.out.print("| "+k+"|  ");			
				k++;
		}
		System.out.print("\n------------------\n");
		
	}
		
}

public static void oyuntahtasi(){
		
	int i,j;
	System.out.println("------------------");
	for(i=0;i<kartlar.length;i++){
		for(j=0;j<kartlar[i].length;j++){
				
			if(kartlar[i][j].isTahmin()){
				System.out.print("| "+ kartlar[i][j].getDeger()+"|  ");
			}
			else{
				System.out.print("| "+"|  ");
			}
				
		}
		System.out.print("\n------------------\n");
		
	}
		
}
		
public static void kayittanAl(){
	
	File file = new File("kayýt.bin"); 
	Scanner scan = new Scanner(System.in);
	if(file.exists()){
		
		System.out.println("Kaydedilmiþ bir oyununuz var. Kayýttan devam etmek ister misiniz?(yes no)yazýn....");
		String cevap = scan.nextLine();
		
		if(cevap.equals("yes")){
			kartlar = OyunKayýt.KayýttanAl();
			return;
		}
		else{
			kartlaridagit();
			karistir();
		}
	}
	
}
		
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		kayittanAl();
		System.out.println("Oyunun amacý 2 ayný kartý bulmak.\n"
				+ "2 ayný Kartý bulunca o kartlar açýk kalacaklar ve tüm kartlarý açýnca oyun biter.\n"
				+ "Açmak istediðiniz kartýn numarasýný yazmanýz gerek numaralar þu þekilde");
		oyuntahtasiilk();
		
		int i=1;
		while(oyun_bitti_mi()==false){
			System.out.println(i+" ninci el");
			oyuntahtasi();
			tahmin_et();
			System.out.println("Çýkýþ için -1 e basýn...");
			
			
			i++;
		}
		System.out.println("Oyunu bitirdiniz tebrikler");
		
	}
	
	
	
	
}
