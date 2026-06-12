package com.gqt;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class client2 {

	public static void main(String[] args) throws IOException {
		Socket csoc = new Socket("192.168.110.28",4000);
		OutputStream os = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		InputStream is = csoc.getInputStream();
		DataInputStream dis = new DataInputStream(is);
        Scanner sc = new Scanner(System.in);
        for(int i =1;i<=5;i++) {
        System.out.println("enter the  message from client");
        String message = sc.nextLine();
        dos.writeUTF(message);
        System.out.println("=====================");
        String rec_message = dis.readUTF();
        System.out.println(rec_message);
        
	}
	}
}
