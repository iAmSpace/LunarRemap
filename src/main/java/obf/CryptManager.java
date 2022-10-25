package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CryptManager {
    public static SecretKey lllIIIllIIIIlllIlIIllIIll() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new Error(noSuchAlgorithmException);
        }
    }

    public static KeyPair lllIlIIlIIIlIlIIIllIlllIl() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            System.err.println("Key pair generation failed!");
            return null;
        }
    }

    public static byte[] lllIIIllIIIIlllIlIIllIIll(String string, PublicKey publicKey, SecretKey secretKey) {
        try {
            return CryptManager.lllIIIllIIIIlllIlIIllIIll("SHA-1", string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return null;
        }
    }

    private static byte[] lllIIIllIIIIlllIlIIllIIll(String string, byte[] ... arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(string);
            byte[][] arrby2 = arrby;
            int n = arrby.length;
            for (int i = 0; i < n; ++i) {
                byte[] arrby3 = arrby2[i];
                messageDigest.update(arrby3);
            }
            return messageDigest.digest();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return null;
        }
    }

    public static PublicKey lllIIIllIIIIlllIlIIllIIll(byte[] arrby) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arrby);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            // empty catch block
        }
        System.err.println("Public key reconstitute failed!");
        return null;
    }

    public static SecretKey decryptSharedKey(PrivateKey privateKey, byte[] arrby) {
        return new SecretKeySpec(CryptManager.decryptData(privateKey, arrby), "AES");
    }

    public static byte[] encryptData(Key key, byte[] arrby) {
        return CryptManager.lllIIIllIIIIlllIlIIllIIll(1, key, arrby);
    }

    public static byte[] decryptData(Key key, byte[] arrby) {
        return CryptManager.lllIIIllIIIIlllIlIIllIIll(2, key, arrby);
    }

    private static byte[] lllIIIllIIIIlllIlIIllIIll(int n, Key key, byte[] arrby) {
        try {
            return CryptManager.lllIIIllIIIIlllIlIIllIIll(n, key.getAlgorithm(), key).doFinal(arrby);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            illegalBlockSizeException.printStackTrace();
        }
        catch (BadPaddingException badPaddingException) {
            badPaddingException.printStackTrace();
        }
        System.err.println("Cipher data failed!");
        return null;
    }

    private static Cipher lllIIIllIIIIlllIlIIllIIll(int n, String string, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(string);
            cipher.init(n, key);
            return cipher;
        }
        catch (InvalidKeyException invalidKeyException) {
            invalidKeyException.printStackTrace();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
        }
        System.err.println("Cipher creation failed!");
        return null;
    }

    public static Cipher lllIIIllIIIIlllIlIIllIIll(int n, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new RuntimeException(generalSecurityException);
        }
    }
}

