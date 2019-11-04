package com.example.standalone;

import com.vaadin.flow.component.upload.Upload;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class File {

    private final String UPLOAD_FILE;
    private final String SAVE__FILE;
    private byte[] binaryFile;


    public File() throws IOException {

        UPLOAD_FILE = "C:\\Users\\User\\Desktop\\ori.bin";
        SAVE__FILE = "C:\\Users\\User\\Desktop\\fileMod.bin";

    }

    private void saveFile() throws IOException {
        FileOutputStream save = new FileOutputStream(SAVE__FILE);
        save.write(binaryFile);
    }


    public List getIgnitionMap() throws IOException {
        binaryFile = Files.readAllBytes(Paths.get(UPLOAD_FILE));
        List<Double> ignitionBytesDecimalUnSign = new ArrayList<>();
        int counter = 0;
        for (int i = 90706; i < 90898; i++) {
            ignitionBytesDecimalUnSign.add((double) (binaryFile[i]) * 0.75);
//            System.out.println(ignition.get(counter) + " ");
            counter++;
        }
//        System.out.println("bajtow: " + counter);
        return ignitionBytesDecimalUnSign;
    }

    public String getUPLOAD_FILE(Upload source) {
        return UPLOAD_FILE;
    }

    public String getSAVE__FILE() {
        return SAVE__FILE;
    }

    public byte[] getBinaryFile() {
        return binaryFile;
    }

    public void setBinaryFile(byte[] binaryFile) {
        this.binaryFile = binaryFile;
    }


}

