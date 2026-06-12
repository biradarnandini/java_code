package com.gqt;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling2 {
public static void main(String[] args) throws IOException {
	String p1 = "C:\\ioprgm//Input1.txt";
	String p2 = "C:\\ioprgm//Output1.txt";
	FileReader fr = new FileReader(p1);
	int temp;
	FileWriter fw = new FileWriter(p2);
	while((temp = fr.read())!= -1) {
		fw.write(temp);
		
	}
	fw.close();
	fr.close();
 }
}
