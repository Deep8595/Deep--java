import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.util.Base64;

public class AES_algorithm{
    private  static SecretKey Key;
    private final int KEY_SIZE = 128;
    private SecretKey key;
    private final static int DATA_LENGTH = 128;
    private static cipher encryptionCipher;

    public void init() throws Exception{
        KeyGenerator keyGenerator = keyGenerator.getInstance("AES");
        keyGenerator.init(KEY_SIZE);
        key = KeyGenerator.generateKey();
    }


// Encryption 
public String encrypt(String data) throws Exception{
    byte[] dataInbytes = data.getBytes();
    encryptionCipher = cipher.getInstance("AES/GCM/NoPadding");
    encryptionCipher.init(cipher.ENCRYPT_MODE, Key);
    byte[] encryptedBytes = encryptionCipher.doFinal(dataInbytes);
    return encode(encryptedBytes);
}

// Decryption 

public static String decrypt(String encryptedData) throws Exception{
    byte[] dataInbytes = decode(encryptedData);
    Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
    GCMParameterSpec spec = new GCMParameterSpec(DATA_LENGTH , encryptionCipher.getIV());
    decryptionCipher.init(Cipher.DECRYPT_MODE, Key , spec);
    byte[] decryptedBytes = decryptionCipher.doFinal(dataInbytes);
    return new String(decryptedBytes);
}

// Encoding and Decoding

private String encode(byte[] data){
    return Base64.getEncoder().encodeToString(data);
}
private static byte[] decode(String data){
    return Base64.getDecoder().decode(data);
}

//java main method

public static void main(String[] args){
    try{
        AES_ENCRYPTION aes_algorithm = new AES_ENCRYPTION();
        aes_algorithm.wait();
        AES_algorithm aes_encryption;
        AES_algorithm eES_ncryption;
        String encryptedData = AES_encryption.encrypt("Hello Deepanshu ");
        String decryptionData = AES_algorithm.decrypt(encryptedData);

        System.out.println("Encyption Data" + encryptedData);
        System.out.println("Decryption Data" + decrypt(null));
    }
    catch (Exception ignored){

    }
  }
}