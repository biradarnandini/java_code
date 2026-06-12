package com.gqt;

import java.util.ArrayList;

public class count1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	  int count = 0;
  	  for(int i = 0; i<al.size();i++) {
  		  if(al.get(i).length()==5) {
  			  count++;
  		  }
  		  }
  	   System.out.println(count);
  	  }
	}


