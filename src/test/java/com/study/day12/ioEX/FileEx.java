package com.study.day12.ioEX;

import java.io.File;
import java.io.IOException;

public class FileEx{
    public static void main(String[] args) throws IOException {
        File f = new File("C:/ocp/abc2.txt");
        f.createNewFile();
    }
}
