package com.gqt;

import java.util.ArrayList;

public class stream3 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	ArrayList<String> res = new ArrayList<String>();  
  	 for(int i = 0;i<al.size(); i++) {
  		 res.add(al.get(i).toUpperCase());
  	 }
  	  System.out.println(res); 
	}
}
