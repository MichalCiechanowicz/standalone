//package com.example.standalone;
//
//import org.springframework.stereotype.Component;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//@Component
//public class testy {
//
//
//    public testy() throws IOException {
//
//        String UPLOAD_FILE = "C:\\Users\\User\\Desktop\\ori.bin";
//        String SAVE__FILE = "C:\\Users\\User\\Desktop\\fileMod.bin";
//
//        byte[] binaryFile = Files.readAllBytes(Paths.get(UPLOAD_FILE));
//
//        getIgnitionMap(binaryFile);
//
//        FileOutputStream save = new FileOutputStream(SAVE__FILE);
//        save.write(binaryFile);
//    }
//
//    private int[][] getIgnitionMap(byte[] byteTable) {
//
//        int[][] table = new int[16][12];
//
//        for (int i = 90706; i < 90899; i++) {
//            for (int k = 0; k < 16; k++) {
//                for (int j = 0; j < 12; j++) {
//                    table[k][j] = (int) (byteTable[i] * 0.75);
//                    i++;
//                    System.out.print(table[k][j] + " ");
//                }
//                System.out.println();
//            }
//
//        }
//        return table;
//    }
//}
