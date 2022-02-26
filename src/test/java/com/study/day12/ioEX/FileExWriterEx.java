package com.study.day12.ioEX;

import java.io.FileWriter;
import java.io.IOException;

public class FileExWriterEx {
    public static void main(String[] args) throws IOException {
        FileWriter f = new FileWriter("C:/ocp/abc2.txt");
        f.write("Hello FileWriter!!!");
        f.close();
    }   
}
