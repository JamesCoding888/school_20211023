package com.study.day12.ioEX;
import java.io.FileReader; 
import java.io.IOException;
public class FileReaderEx {
    public static void main(String[] args) throws IOException{        
        FileReader  f = new FileReader("C:/ocp/abc2.txt");
        int i;
        /*if((i=f.read())!=-1) System.out.println((char)i);
		if((i=f.read())!=-1) System.out.println((char)i);*/		
		while((i=f.read())!=-1)
		{			
			System.out.printf("印出 ASCII: %s = %s \n",i,(char)i);                                               
		}        
    }        
}
