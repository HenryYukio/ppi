package crypto;

import java.io.UnsupportedEncodingException;

public class CryptoUtilsTest {
    public static void main(String[] args) {
  
			try {
				String key = "henryyukioteste1";
				String texto = "henry";
				byte[] bTexto = texto.getBytes("ISO-8859-1");
				System.out.println("mensagem: " + texto);
				byte[] bCripto = CryptoUtils.encrypt(key, bTexto);
				String cripto = new String(bCripto, "ISO-8859-1");
				System.out.println("cripto: " + cripto);
				byte[] bDecripto = CryptoUtils.decrypt(key, bCripto);
				String decripto = new String(bDecripto, "ISO-8859-1");
				System.out.println("decripto: " + decripto);
				System.out.println("iguais? " + texto.equals(decripto));
			} catch (UnsupportedEncodingException | CryptoException e) {
				e.printStackTrace();
			}
    }
}