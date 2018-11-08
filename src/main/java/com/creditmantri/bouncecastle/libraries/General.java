package com.creditmantri.bouncecastle;

import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class General {

    public String shaHashing(String base) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(base.getBytes(StandardCharsets.UTF_8));
        String sha256hex = new String(Hex.encode(hash));

        return sha256hex;
    }
}

