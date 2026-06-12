

package com.gqt;


import java.io.*;

public class filehandling4 {
public static void main(String[] args) throws IOException {
	String p1 = "C:\\ioprgm//Input3.txt";
	String p2 = "C:\\ioprgm//Output3.txt";
	FileInputStream  fis = new FileInputStream(p1);
	BufferedInputStream bis = new BufferedInputStream(fis);
	int temp;
	FileOutputStream fos = new FileOutputStream(p2);
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	while((temp = bis.read())!= -1) {
		bos.write(temp);
		
	}
	bos.close();
	bis.close();
	fos.close();
	fis.close();
 }
}
