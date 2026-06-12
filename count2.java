package com.gqt;

import java.util.ArrayList;

public class count2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	  long count = al.stream().filter(s->s.length()==5).count();
  	  System.out.println(count);
	}

}
