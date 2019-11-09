package com.example.standalone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class Testy {

    String UPLOAD_FILE = "C:\\Users\\User\\Desktop\\ori.bin";
    byte[] binaryFile;
    RegistryService registryService;

    @Autowired
    public Testy(RegistryService registryService) throws IOException {

        this.registryService = registryService;
        binaryFile = Files.readAllBytes(Paths.get(UPLOAD_FILE));
    }

    public int[][] getIgnitionMap() {

        int[][] table = new int[16][12];
        for (int i = 90706; i < 90899; i++) {
            for (int k = 0; k < 16; k++) {
                registryService.getRegistryList().add(new Registry(
                        (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75),
                        (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75),
                        (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75),
                        (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75), (binaryFile[i++] * 0.75)));
            }
        }
        return table;
    }
}