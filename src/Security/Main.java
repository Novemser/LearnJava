package Security;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.*;

/**
 * Project: LearnJava
 * Package: Security
 * Author:  Novemser
 * 2016/10/25
 */
public class Main {
    public static void main(String... args) throws Exception {
        File file = new File("F:\\code");

        // Get the key pair generator
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
        // We need an random source
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
        // Init the keyGenerator with random source&1024
        keyGen.initialize(1024, random);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        // Use DSA algorithm to generate or verify signature
        Signature dsa = Signature.getInstance("SHA1withDSA", "SUN");
        dsa.initSign(privateKey);

        // Provide the input file to Signature object
        FileInputStream fileStream = new FileInputStream(file);
        BufferedInputStream buffIn = new BufferedInputStream(fileStream);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = buffIn.read(buffer)) >= 0) {
            dsa.update(buffer, 0, len);
        }
        buffIn.close();

        // Generate
        byte[] realSig = dsa.sign();

        // Save the signature in a file
        FileOutputStream sigOut = new FileOutputStream("F:\\signature");
        sigOut.write(realSig);
        sigOut.close();

        // Save the public key in a file
        FileOutputStream pubKey = new FileOutputStream("F:\\publicKey");
        pubKey.write(publicKey.getEncoded());
        pubKey.close();
    }
}
