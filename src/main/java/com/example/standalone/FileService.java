package com.example.standalone;

import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileService {

    public FileService() throws IOException {

        String path = "C:\\Users\\User\\Desktop\\ori.bin";
        String path2 = "C:\\Users\\User\\Desktop\\fileMod.bin";

        byte[] byteTable = Files.readAllBytes(Paths.get(path));

        int counter = 0;
        for (byte e : byteTable) {
            if (counter < 16) {
                System.out.println(e);
                counter++;
            }
        }

        int[][] table = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4; k++) {
                table[i][k] = byteTable[i] + 10;
//                    System.out.print(table[i][k]);
            }
//                System.out.println("");
        }
        int counter2 = 0;
        for (byte e : byteTable) {
            if (counter2 < 16) {
                System.out.println(e);
                counter2++;
            }
        }
        FileOutputStream out = new FileOutputStream(path2);
        out.write(byteTable);

//        ArrayList<Integer> record = new ArrayList<>();
//
//        Integer ch;
//        int charCnt = 0;
//        int cutoff = 5; // set to -1 for all input.
//        while ((ch = fin.read()) != -1) {
//
//            if (cutoff != -1 && charCnt >= cutoff) {
//                break;
//            }
//            record.add(ch);
////            System.out.println(ch);
////            System.out.printf("0x%05x: 0x%04x\n", charCnt, ch);
//            charCnt++;
//        }
//        System.out.println(record.get(0));
//        System.out.println(record.get(1));
//        System.out.println(record.get(2));
//        System.out.println(record.get(3));
//        for (Object el : record) {
//            System.out.printf("0x%05x: ", el);
//        }
//        fin.close();
//        System.out.println("total chars: " + charCnt);
    }
}

