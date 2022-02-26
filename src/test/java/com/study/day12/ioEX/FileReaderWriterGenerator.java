package com.study.day12.ioEX;
import java.io.FileReader; 
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterGenerator {
	public static void main(String[] args) throws IOException {
		FileReader r = new FileReader("C:/Users/jamesliao/work/school/src/test/java/com/study/day8/ClassName.java");
		int i;
		String packageTargetName = "package com.web.day8;";
		String packageReplaceName = "package com.study.day8;";
		String contentofJavaClassString = "";
		String contentReplaceOfJavaClassString = "";
		while ((i = r.read()) != -1) {
//				System.out.printf("印出 ASCII: %s = %s \n",i,(char)i);
			contentofJavaClassString += (char) i;
		}
		r.close();
//		System.out.println(contentofJavaClassString);
		contentReplaceOfJavaClassString = contentofJavaClassString.replace(packageTargetName,packageReplaceName);
		System.out.println(contentReplaceOfJavaClassString);
		FileWriter  w = new FileWriter("C:/Users/jamesliao/work/school/src/test/java/com/study/day8/ClassName.java");				
		w.write(contentReplaceOfJavaClassString);
		w.close();
	}
}
