package com.adam.myspringboot.tink;

import com.google.crypto.tink.CleartextKeysetHandle;
import com.google.crypto.tink.JsonKeysetWriter;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.aead.AeadConfig;
import com.google.crypto.tink.aead.AesGcmKeyManager;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

public class TinkConfiguration {

    public void init() throws GeneralSecurityException, IOException {
        AeadConfig.register();
        KeyTemplate keyTemplate = AesGcmKeyManager.aes128GcmTemplate();
        KeysetHandle keysetHandle = KeysetHandle.generateNew(keyTemplate);
        String keySetFilename = "my_keySet.json";
        System.out.println("print test");
        CleartextKeysetHandle.write(keysetHandle, JsonKeysetWriter.withFile(
                new File(keySetFilename)));
    }
}
