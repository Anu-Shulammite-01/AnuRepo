import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class FileCrypto {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Reader r = new FileReader("FileC.txt");
        BufferedReader br = new BufferedReader(r);
        String line;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine())!=null){
            sb.append(line+"\n");
        }
        String content = sb.toString().trim();
        System.out.println("Before Encryption: "+content);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey sKey = keyGen.generateKey();

        //Encrypt the file
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(cipher.ENCRYPT_MODE,sKey);
        byte[] input = content.getBytes();
        byte[] cipherText = cipher.doFinal(input);
        String encrypted = Base64.getEncoder().encodeToString(cipherText);
        System.out.println("Encrypted text is: "+encrypted);

        //Write the encrypted file
        Writer w = new FileWriter("Encrypted.txt");
        w.write(encrypted);
        w.close();

        //Decrypt the file
        cipher.init(cipher.DECRYPT_MODE,sKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
        String decryptedText = new String(decrypted);
        System.out.println("Decrypted text is: "+decryptedText);


        
    }
}