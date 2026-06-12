
package com.gqt;


import java.io.*;

public class filehandling3 {
public static void main(String[] args) throws IOException {
	String p1 = "C:\\ioprgm//Input2.txt";
	String p2 = "C:\\ioprgm//Output2.txt";
	FileReader fr = new FileReader(p1);
	BufferedReader br = new BufferedReader(fr);
	int temp;
	FileWriter fw = new FileWriter(p2);
	BufferedWriter bw = new BufferedWriter(fw);
	while((temp = fr.read())!= -1) {
		bw.write(temp);
		
	}
	bw.close();
	br.close();
	fw.close();
	fr.close();
 }
}
