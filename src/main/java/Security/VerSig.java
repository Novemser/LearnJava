package Security;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/**
 * Project: LearnJava
 * Package: Security
 * Author:  Novemser
 * 2016/10/25
 */
public class VerSig {
    public static void main(String[] args) throws Exception {
        // Read public key from file
        FileInputStream publicKeyFile = new FileInputStream("F:\\publicKey");
        byte[] encPubKey = new byte[publicKeyFile.available()];
        publicKeyFile.read(encPubKey);  // Now the byte array encPub
                                        // Key contains the encoded public key bytes.
        publicKeyFile.close();

        // Generate a public key from file
        X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(encPubKey);
        KeyFactory factory = KeyFactory.getInstance("DSA", "SUN");
        PublicKey publicKey = factory.generatePublic(publicKeySpec);

        // Input the signature bytes
        FileInputStream signatureFile = new FileInputStream("F:\\signature");
        byte[] signatureByte = new byte[signatureFile.available()];
        signatureFile.read(signatureByte);
        signatureFile.close();

        // Init the signature object
        Signature sig = Signature.getInstance("SHA1withDSA", "SUN");
        sig.initVerify(publicKey);

        // Supply the data to be verified
        FileInputStream dataFile = new FileInputStream("F:\\code");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(dataFile);
        byte[] tmpBuffer = new byte[1024];
        int len;
        while (bufferedInputStream.available() > 0) {
            len = bufferedInputStream.read(tmpBuffer);
            sig.update(tmpBuffer, 0, len);
        }

        bufferedInputStream.close();

        // Out put the result
        boolean verifyResult = sig.verify(signatureByte);
        System.out.println("Verification result:\n" + verifyResult);
    }
}
