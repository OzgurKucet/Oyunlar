import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class OyunKay�t {
	
	public static void oyunKaydet(Kart[][] kartlar){
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kay�t.bin"))){
			System.out.println("Oyun kaydediliyor...");
			out.writeObject(kartlar);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public static Kart[][] Kay�ttanAl(){
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kay�t.bin"))){
			
			Kart[][] cikti = (Kart[][]) in.readObject();
			
			return  cikti;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
