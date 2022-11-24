package org.example;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


//encoding class
public class Encoding {
    public static String encoding(Object value) throws NoSuchAlgorithmException {
        String encoded= String.valueOf(value);
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] hash = digest.digest(encoded.getBytes(StandardCharsets.UTF_8));
        encoded = Base64.getEncoder().encodeToString(hash);
        return encoded;
    }
}
