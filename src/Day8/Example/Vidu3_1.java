package Day8.Example;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
public class Vidu3_1 {
  public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
	  // Ví dụ demo sử dụng AES
	  // Mã hóa bằng khóa bí mật
	String SECRET_KEY   = "this's secretkey";
    SecretKeySpec skeySpec = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
    
    //Tạo dữ liệu cần mã hóa
    String original = "This is original data";

    //Mã hóa
    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
    byte[] byteEncrypted = cipher.doFinal(original.getBytes());
    String encrypted =  Base64.getEncoder().encodeToString(byteEncrypted);
    
    //Giải mã
    cipher.init(Cipher.DECRYPT_MODE, skeySpec);
    byte[] byteDecrypted = cipher.doFinal(byteEncrypted);
    String decrypted = new String(byteDecrypted);
    
    System.out.println("original  text: " + original);
    System.out.println("encrypted text: " + encrypted);
    System.out.println("decrypted text: " + decrypted);
    
  }
}
