package com.gqt;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class cilent1 {

	public static void main(String[] args) throws IOException {
		Socket csoc = new Socket("192.168.0.102",4000);
		OutputStream is = csoc.getOutputStream();
		DataOutputStream dos = new DataOutputStream(is);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  message from client");
        String message = sc.nextLine();
        dos.writeUTF(message);
        
	}

}
