package com.cache;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;




public class CipherAES{

	 	private static SecretKeySpec secretKey;
	    private static byte[] key;

	    
	    public Object keyGenerate(String myKey) {
			// TODO Auto-generated method stub
	    	MessageDigest sha = null;
	        try {
	            key = myKey.getBytes("UTF-8");
	            sha = MessageDigest.getInstance("SHA-1");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            secretKey = new SecretKeySpec(key, "AES");
	        }
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
			return secretKey;
		}

	
	public String encrypt(String strToEncrypt, String secret_key) {
		// TODO Auto-generated method stub
		try
        {
			keyGenerate(secret_key);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
		return null;
	}

	public String decrypt(String strToDecrypt, String secret_key) {
		// TODO Auto-generated method stub
		 try
	        {
			 keyGenerate(secret_key);
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	            cipher.init(Cipher.DECRYPT_MODE, secretKey);
	            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error while decrypting: " + e.toString());
	        }
		return null;
	}
	
//	public static void main(String[] args)
//
//	{
//
//	    final String secretKey = "key_nonce";
//
//	    CipherAES ca=new CipherAES();
//
//	    String originalString = "OurValue";
//
//	    String encryptedString = ca.encrypt(originalString, secretKey) ;
//	    
//
//	    String decryptedString = ca.decrypt(encryptedString, secretKey) ;
//
//
//
//	    System.out.println(originalString);
//
//	    System.out.println(encryptedString);
//
//	    System.out.println(decryptedString);
//
//}
	
}
