package com.creditmantri.bouncecastle.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import com.creditmantri.vault.libraries.General;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncryptionController {

    @RequestMapping("/greeting", method = RequestMethod.POST)
    public ResponseEntity encrpty(@RequestBody EncrypAlgoriyhm algo, General general)
    {
         LOGGER.info("Encryption code here");
        try {
            LOGGER.info("Encrption of given value =>>>>>>>>>>>>>>"+general.shaHashing(algo.encryptAlgorithm()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok(HttpStatus.OK);
    }
}
